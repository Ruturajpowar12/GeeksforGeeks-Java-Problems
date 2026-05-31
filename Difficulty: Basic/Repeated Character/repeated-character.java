class Solution {
    char firstRep(String s) {
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first repeating character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] > 1) {
                return s.charAt(i);
            }
        }

        return '#';
    }
}