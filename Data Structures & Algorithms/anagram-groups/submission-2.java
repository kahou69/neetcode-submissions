class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // < sorted , ListOfAddedAnagrams>
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String (sorted);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(strs[i]);
            } else {
                map.put(sortedString, new ArrayList<>(Arrays.asList(strs[i])));
            }

        }

        return new ArrayList<>(map.values());
    }
}
