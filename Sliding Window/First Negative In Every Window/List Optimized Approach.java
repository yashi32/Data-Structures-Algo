import java.util.*;
public class Solution {
	public static int[] firstNegative(int[] arr, int n, int k) {

		int i=0;
		int j=0;
		List<Integer> ans=new ArrayList<Integer>();
		int[] final_ans=new int[n-k+1];


		while(j<n)
		{	
			if(arr[j]<0)
			{
				ans.add(arr[j]);
			}
			
			if(j-i+1<k)
			{
				j++;
			}

			//When window size hits k
			else if(j-i+1==k)
			{
				//If List is Empty
				if(ans.size()==0)
				{
					final_ans[i]=0;
				}
				//If List is not Empty
				else
				{
					final_ans[i]=ans.get(0); //Gets the front element of List
					if(arr[i]==ans.get(0))
					{
						ans.remove(0);	
					}
					
				}
				i++;
				j++;

			}
		}
		return final_ans;
	}
}
