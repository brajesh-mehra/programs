import java.util.*;
import java.lang.*;
import java.io.*;

public class Dijkstras {
	
	public static void main(String[] args)
	{
		System.out.println("Dijkstras Algorithm to find shortest path of a graph");
		
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
	}
}

// Subarray problem
class Solution
{
    /Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // validate inputs
        if(arr == null || arr.length == 0 && n == 0 && s == 0) return null;
        
        ArrayList<Integer> subArray = new ArrayList<>();
        
        int p1 = 0, p2 = 0;
        long sum = arr[0];
        
        if(sum == s) 
        {
            subArray.add(1);
            subArray.add(1);
            return subArray;
        }
        
        while(p2 < n-1)
        {
            if(sum + arr[p2 +1] <= s)
            {
                sum += arr[p2+1];
                p2++;
            }else
            {
                sum -= arr[p1];
                p1++;
            }
            
            if(sum == s)
            {
                subArray.add(p1+1);
                subArray.add(p2+1);
                return subArray;
            }
           
        }
         subArray.add(-1);
        return subArray;
    }
}