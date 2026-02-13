// Last updated: 2/13/2026, 3:15:35 PM
class Solution 
{
    int c=0;
    public int numberOfSteps(int num) 
    {
        // if(num <0)
        // return -1;
        while(num >0)
        {
            if(num % 2 == 0)
            {
                   num = num/2;
                   c++;
            }
            else
            {
                   num = num - 1 ;
                   c++;
            }
        }
        return c;

    }
}