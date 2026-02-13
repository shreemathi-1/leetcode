// Last updated: 2/13/2026, 3:17:25 PM
class Solution {
    
    public int lengthOfLastWord(String s) 
{
    int length = 0;
    boolean lettersSeen = false;

    for (int i = s.length()-1; i >= 0; i--)
    {
        char c = s.charAt(i);
        if (c != ' ')
        {
            length++;
            lettersSeen = true;
            continue;
        }

        if (c == ' ' && lettersSeen) break;
    }

    return length;
}
}