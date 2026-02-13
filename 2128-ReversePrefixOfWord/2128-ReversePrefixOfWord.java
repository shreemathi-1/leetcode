// Last updated: 2/13/2026, 3:15:18 PM
class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int len = word.length();
        Stack<Character> st = new Stack<Character>();
        StringBuilder res = new StringBuilder();
        int c =0;
        boolean found = false;
        for(int i =0;i<len;i++)
        {
            if(word.charAt(i) == ch)
            {
                found = true;
                res.append(ch);
                while(!st.isEmpty())
                res.append(st.pop() );

                 if(st.isEmpty())
                break;
            }
             st.push(word.charAt(i) );
             c++;
                     
        }
        for(int i =c+1;i<len;i++)
        {
            res.append( word.charAt(i) );  
        }
        if(found)
        return res.toString();
        else
        return word;
    }
}