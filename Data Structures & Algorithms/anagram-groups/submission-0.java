class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : strs) {
            char[] charWord = word.toCharArray();
            Arrays.sort(charWord);
            String sortedWord = new String (charWord);

            if (!anagrams.containsKey(sortedWord)) {
                anagrams.put(sortedWord, new ArrayList<>());
            }

            anagrams.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagrams.values());
    }
}
