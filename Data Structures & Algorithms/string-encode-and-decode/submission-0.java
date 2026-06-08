class Solution {



    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            encodedString.append(str.length());
            encodedString.append("#");
            encodedString.append(str);
        }

        return encodedString.toString();
      }
      
        public List<String> decode(String str) {
            List<String> decoded = new ArrayList<>();
            int i = 0;

            while (i < str.length()) {
                int j = i;

                // find '#'
                while (str.charAt(j) != '#') {
                    j++;
                }

                // parse full number (not just 1 char)
                int length = Integer.parseInt(str.substring(i, j));

                int start = j + 1;
                int end = start + length;

                decoded.add(str.substring(start, end));

                i = end; // move to next encoded chunk
            }

            return decoded;
        }
}
