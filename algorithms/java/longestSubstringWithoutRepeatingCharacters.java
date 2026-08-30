class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int max = 0;

        for(int r = 0; r < s.length(); r++){
            char currentChar = s.charAt(r);

            while(set.contains(currentChar)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(currentChar);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
