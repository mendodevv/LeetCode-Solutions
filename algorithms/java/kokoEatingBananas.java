class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int sum = 0;
        int l = 1, r = Arrays.stream(piles).max().getAsInt();

        while(l < r){
            sum = 0;
            int mid = (l + r) / 2;

            for(int i = 0; i < piles.length; i++){
                sum += (piles[i] + mid - 1) / mid;
            }

            if(sum <= h){
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
