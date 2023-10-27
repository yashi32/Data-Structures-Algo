import java.util.*;
public class Solution {
	public static int[] firstNegative(int[] arr, int n, int k) {

		int i=0;
		int j=0;
		List<Integer> ans=new ArrayList<Integer>();
		int[] final_ans=new int[n-k+1];
		Arrays.fill(final_ans, 0);


		while(j<n)
		{	
			ans.add(arr[j]);
			

			if(j-i+1<k)  // When window size is less than k
			{
				j++;
			}

			else if(j-i+1==k)  // Case when window size hits k 
			{
				for(int l=0;l<ans.size();l++)
				{
					if(ans.get(l)<0)
					{
						final_ans[i]=ans.get(l);
						break;
					}
					
				}
				ans.remove(0);
				i++;
				j++;
			}
		}
		return final_ans;
	}
}
