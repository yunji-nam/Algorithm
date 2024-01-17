import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<words.length; i++) {
            if(i!=0){
                if(list.contains(words[i]) || words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) {
                    answer[0] = i%n + 1;
                    answer[1] = i/n + 1;
                    return answer;
                }
            }
            list.add(words[i]);
        }
        return answer;
    }
}