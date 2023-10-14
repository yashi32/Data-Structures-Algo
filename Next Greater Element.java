import java.util.*;
public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.

         int[] ans=new int[n];    
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i=n-1;i>=0;i--)
        {
            if(stack.size()==0)// If stack is Empty
            {
                ans[i]=-1;
            }
            
            else if(arr[i]<stack.peek()) // If element is less than stack top
            {
                ans[i]=stack.peek();
                
            }
            
            else if(arr[i]>=stack.peek()) // If element greater than stack top
            {
                while(stack.size()!=0 && arr[i]>=stack.peek())  /*
                                                              Pop until stack is not empty & curent 
                                                               element is greater than stack top
                                                               */
                {
                    stack.pop();
                }
                
                if(stack.size()==0)
                {
                    ans[i]=-1;
                }
                
                else{
                    
                    ans[i]=stack.peek();
                }
            }
            
            stack.push(arr[i]); //push the traversed element into stack
            
        }

        return ans;
        
    }
}
