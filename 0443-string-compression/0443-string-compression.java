class Solution {
    public int compress(char[] chars) {
       int n = chars.length;
        if(n == 1) return 1;

        int i = 0;
        int idx = 0;
        while(i < n) {
            char curr_char = chars[i];
            int count = 0;

            while( i < n && chars[i] == curr_char) {
                count += 1;
                i++;
            }
            chars[idx] = curr_char;
            idx += 1;        


            if(count > 1) {
                String str = Integer.toString( count );
                for(char ch : str.toCharArray()) {
                    chars[idx++] = ch;
                }
            }

        }
        return idx;

    }
}