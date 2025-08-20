import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to group anagrams
        // Key = sorted string, Value = list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert to char array and sort
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // Create a key from sorted characters
            String key = new String(chars);

            // If key not in map, add it
            map.putIfAbsent(key, new ArrayList<>());

            // Add the original word into the correct group
            map.get(key).add(word);
        }

        // Return all grouped lists
        return new ArrayList<>(map.values());
    }
}
