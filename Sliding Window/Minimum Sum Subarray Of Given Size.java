import java.util.* ;
import java.io.*; 
public class Solution
{
public static int minSubarraySum(ArrayList<Integer> arr, int n, int k)
    {
        // Write your code here.

        int i=0;
        int j=0;
        int sum=0;
        int min_sum=Integer.MAX_VALUE;

        while(j<n)
        {   
            sum+=arr.get(j);
            if(j-i+1<k)
            {
                j++;
            }

            else if(j-i+1==k)
            {
                min_sum=Math.min(sum,min_sum);
                sum=sum-arr.get(i);
                i++;
                j++;
            }
        }

        return min_sum;
    }
}
