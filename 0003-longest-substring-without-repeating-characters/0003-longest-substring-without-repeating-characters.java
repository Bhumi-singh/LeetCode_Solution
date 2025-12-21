import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            // If the character is already in the window, move left pointer
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right); // store/update index of current character
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
