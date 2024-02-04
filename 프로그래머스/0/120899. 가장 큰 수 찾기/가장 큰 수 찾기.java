import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int index = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        int[] solution = {max, index};
        return solution;

    }
}
