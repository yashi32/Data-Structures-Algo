public class Solution {
    public int[] prevSmaller(int[] A) {
        
        Stack<Integer> stack=new Stack<Integer>();
        int ans[]=new int[A.length];
        
        for(int i=0;i<A.length;i++)
        {
            if(stack.size()==0)
            {
                ans[i]=-1;
            }
            
            else if(stack.peek()<A[i])
            {
                ans[i]=stack.peek();
            }
            
            else if(stack.peek()>=A[i])
            {
                while(stack.size()!=0 && stack.peek()>=A[i])
                {
                    stack.pop();
                }
                if(stack.size()==0)
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i]=stack.peek();
                }
            }
            
            stack.push(A[i]);
            
        }
        
        return ans;
    }
}
