class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int highest = 0;
        
        // Get highest number of candies from array
        for(int i = 0; i < candies.length; i++){
            if (candies[i] > highest){
                highest = candies[i];
            }
        }
        
        // Check if the kid has the more or as many candies as the kid with the most candy
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= highest){
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
