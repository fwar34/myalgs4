package DataStruct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
    public static int search(int[] a, int key)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) 
            {
                lo = mid + 1;
            }
            else if (key < a[mid])
            {
                hi = mid - 1;
            }
            else
            {
                return a[mid];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        int i = 0;
        int[] array = new int[10000000];
        FileInputStream inputStream = new FileInputStream(new File(args[0]));
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            array[i++] = scanner.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println(BinarySearch.search(array, 15225));
    }
}
