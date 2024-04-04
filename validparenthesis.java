class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0, currentDepth = 0;
        // Using a traditional for loop to iterate through the string by index
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Access the character at the current index
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
}
