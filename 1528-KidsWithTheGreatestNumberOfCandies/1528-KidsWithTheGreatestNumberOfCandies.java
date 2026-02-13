// Last updated: 2/13/2026, 3:15:34 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int n = candies.length;
        List<Boolean> l = new ArrayList<>();
        boolean[] arr = new boolean[n];
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        for(int i =0;i<n;i++)
        {
            if(candies[i]+ extraCandies >= max)
            {
                arr[i] = true;
            }
            else
            {
                 arr[i] = false;
            }
        }
        for(int i =0;i<n;i++)
        {
            l.add(arr[i]);
        }
        return l;
    }
}