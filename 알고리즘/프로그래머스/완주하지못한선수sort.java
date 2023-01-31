import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);
        // 두 배열이다를때까지 찾는다.
        int i = 0;
        for(; i < completion.length; i++) 
            if(!participant[i].equals(completion[i]))
                break;

        return participant[i];
        
        // 마지막 주자가 완주하지 못한 선수다.
        
    }
}