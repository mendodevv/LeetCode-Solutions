class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }

        double avg = windowSum / k;

        for(int r = k; r < nums.length; r++){
            windowSum +=  nums[r];
            windowSum -= nums[r - k];

            if((windowSum / k) > avg){
                avg = windowSum / k;
            }
        }
        return avg;
    }
}
