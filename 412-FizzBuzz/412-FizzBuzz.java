// Last updated: 2/13/2026, 3:16:02 PM
class Solution {
    public List<String> fizzBuzz(int n) 
    {
        List<String> l = new ArrayList<>();
        String[] arr = new String[n+1];
        for(int i =1;i<=n;i++)
        {
            if(i%5 == 0 && i%3==0)
            {
               arr[i] = "FizzBuzz";
            }
            else if(i%5 == 0)
            {
                arr[i] = "Buzz";
            }
            else if(i%3 == 0)
            {
                arr[i] = "Fizz";
            }
            else
            {
                arr[i] = Integer.toString(i);
            }
        }
        for(int i=1;i<=n;i++)
        {
            l.add(arr[i]);
        }
        return l;
    }
}