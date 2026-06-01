// Last updated: 6/1/2026, 3:01:27 PM
class Solution {
    int [] map;
    
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        
        Arrays.sort(coins);
        map = new int[amount + 1];
        
        for (int coin : coins){
            if (coin <= amount)
                map[coin] = 1;
        }
        
        return findCoinChange(coins, amount);
    }
    
    private int findCoinChange(int [] coins, int amount) {
        if (map[amount] != 0)
            return map[amount];
        
        int test; 
        
        int min = -1;
        
        for (int i = coins.length - 1; i >= 0; --i) {
            if (min != -1 && coins[i]*min < amount)
                break;
            
            if (amount > coins[i]) {
                test = 1 + findCoinChange(coins, amount - coins[i]);
                if (test != 0)
                    min = min == -1 ? test : Math.min(test, min);
            }
        }
        
        map[amount] = min;
        
        return min;
    }
}