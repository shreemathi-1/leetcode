// Last updated: 4/4/2026, 3:58:28 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {

         
        HashSet<Integer>set = new HashSet<>();
        for( int num : nums)
        {

           if(set.contains(num))
           {
            return true;
            
           }
           else
           {
            set.add(num);
           }




        }
        return false;
        
        
    }
}