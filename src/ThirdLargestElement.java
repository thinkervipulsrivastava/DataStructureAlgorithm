// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class ThirdLargestElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            GfG2 g = new GfG2();
            System.out.println(g.thirdLargest(arr,n));
            t--;
        }
    }
}// } Driver Code Ends


