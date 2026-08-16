class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int s : stones) {
            count[s % 3]++;
        }

        // If no type 1 or type 2 stones, Alice cannot win
        if (count[1] == 0 && count[2] == 0) return false;

        // If count[0] is even, Alice wins if both type 1 and type 2 exist
        if (count[0] % 2 == 0) {
            return count[1] > 0 && count[2] > 0;
        } else {
            // If count[0] is odd, Alice wins if one type dominates the other by more than 2
            return Math.abs(count[1] - count[2]) > 2;
        }
    }
}
