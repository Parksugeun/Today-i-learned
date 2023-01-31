import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //1. Hash map을 만든다.(participant를 기반으로)
        HashMap<String, Integer> map = new HashMap<>();

        for(String player : participant)
            map.put(player, map.getOrDefault(player, 0) +1); // map에서 플레이어라는 키를 가진 값을 가져달라 만약 없으면 0을 달라

       
        //2. Hash map을 뺀다.(completion을 기반으로)
        for(String player: completion)
            map.put(player, map.get(player) -1);

        //3. value가 0이 아닌 마지막 주자를 찾는다.
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() !=0) {
                answer= entry.getKey();
                break;
            }

        }
        return answer;
    }
}