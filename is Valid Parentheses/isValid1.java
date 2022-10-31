// This only works for string that have brackets in sorted order such as []{}()
class Solution {
    public boolean isValid(String s) {
        
      Stack<String> stack = new Stack<String>();
        
        //using for-loop pushing opening parentheses to the stack
        //pop the stack element when scanning closing parentheses 
        //post condition: every close bracket will pop and open bracket in the stack of the same type, 
        //leaving the stack empty 
        for(int i=0; i< s.length(); i++){
            String ch = s.substring(i, i+1);
            if(ch.equals("(") || ch.equals("{") || ch.equals("[")){
                stack.push(ch);
            }else{
                if(ch.equals(")") || ch.equals("}") || ch.equals("]")){
                    if (stack.isEmpty()) //number of closing parentheses > number of opening parentheses
                        return false;
                    else
                    stack.pop(); 
                }//end if 
            }//end else 
        }//end for loop
        return stack.isEmpty();
        
    }
}
