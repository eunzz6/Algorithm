class Solution {
    public int[] solution(int n) {
        int solution[] = new int[(n+1)/2];
        
        for (int i = 0; i<solution.length; i++){
            solution[i] = (i*2)+1;
        }
        return solution;
    }
}