import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.

        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<Integer>stack=new Stack<Integer>();

        for(int i=n-1;i>=0;i--)
        {
            if(stack.size()==0)
            {
                ans.add(-1);
            }

            else if(stack.size()>0 && stack.peek()<arr.get(i))
            {
                ans.add(stack.peek());
            }

            else if(stack.size()>0 && stack.peek()>=arr.get(i))
            {
                while(stack.size()!=0 && stack.peek()>=arr.get(i))
                {
                    stack.pop();
                }

                if(stack.size()==0)
                {
                    ans.add(-1);
                }

                else
                {
                    ans.add(stack.peek());
                }
            }

            stack.push(arr.get(i));
        }
        Collections.reverse(ans);


        return ans;
    }
}
