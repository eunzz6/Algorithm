import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int solution = array[array.length/2];
        return solution;
    }
}