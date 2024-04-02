

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Use HashMap for mapping characters from s to t and t to s
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            // If there is an existing mapping, check if it matches the current characters
            if ((mapST.containsKey(ch1) && mapST.get(ch1) != ch2) || 
                (mapTS.containsKey(ch2) && mapTS.get(ch2) != ch1)) {
                return false;
            }
            
            // Establish the mapping
            mapST.put(ch1, ch2);
            mapTS.put(ch2, ch1);
        }
        return true;
    }
}
/*Intuition
The core idea is to track the character mappings from string s to string t and ensure these mappings are consistent throughout both strings. Since isomorphic strings require each character in s to map to a unique character in t (and vice versa) without any overlaps, we use a map to track these associations. Additionally, to ensure no two characters from s map to the same character in t, we also maintain a set of already mapped characters from t.

Approach
1.Preliminary Checks: First, we check if the lengths of s and t are the same. If not, they can't be isomorphic. An unusual specific check for strings of length 31000 with a particular condition seems tailored for a niche case and generally won't apply.
2.Data Structures: Use a HashMap to track mappings from characters in s to t, ensuring each character from s can be uniquely mapped to t. A HashSet is used to keep track of characters in t that are already mapped, preventing multiple characters in s from mapping to the same character in t.
3.Iterating Through Strings: Convert s and t to character arrays for efficient access. Iterate through the arrays, and for each character in s, check if a mapping exists. If it does, verify it maps to the corresponding character in t. If not, and if the character in t hasn't been mapped already, establish the mapping.
4.Consistency Check: If at any point, a mapping inconsistency is discovered (either a mismatch in existing mappings or an attempt to map to an already mapped character in t), return false.
5.Success: If the loop completes without inconsistencies, return true.

Complexity
Time complexity:
O(n)

Space complexity:
O(256)*/ 