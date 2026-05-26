class Solution {
    public int numberOfSpecialChars(String word) {
        int c = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            char upper = Character.toUpperCase(ch);

            if (word.contains(String.valueOf(ch)) &&
                word.contains(String.valueOf(upper))) {

                c++;
            }
        }

        return c;
    }
}