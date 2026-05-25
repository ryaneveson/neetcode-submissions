class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map where the key is the sorted characters, 
        // and the values in the map are the strings that are the same
        Map<String, List<String>> ans = new HashMap<>();
        //Loop through each string 
        for(String s : strs) {
            //convert the string to an array of characters
            char[] characters = s.toCharArray();
            // Sort them and then make this the key in the hash
            Arrays.sort(characters);
            String sortedString = new String(characters);
            //if the key does not already exist, make it a key
            ans.putIfAbsent(sortedString, new ArrayList<>());
            // add the value to the hash under the correct 
            // key for the string that you are on
            ans.get(sortedString).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
