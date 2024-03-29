import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    List<String> answerList = new ArrayList<>();
    Map<String, Integer> hashMap = new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
        //1. 각 order 정렬
        for(int i=0; i<orders.length; i++){
            char[] arr = orders[i].toCharArray(); // String 자체를 각각 알파벳을 정렬할 수 없기 때문에 캐릭터 배열로 바꾸고 정렬
            Arrays.sort(arr);
            orders[i]= String.valueOf(arr); // 다시 orders[i]에다 정렬된 거를 String 값으로 담아줌
        }
        //2. 각 order를 기준으로 courseLength만큼의 조합 만들기
        for(int courseLength: course){
            for(String order : orders)
                combination("", order, courseLength);
        
        //3. 가장 많은 조합을 answer에 저장
        if(!hashMap.isEmpty()){
            List<Integer> countList = new ArrayList<>(hashMap.values());
            int max = Collections.max(countList);

            if(max > 1)
                for(String key : hashMap.keySet())
                    if(hashMap.get(key) == max)
                        answerList.add(key);
                hashMap.clear();
            }
        }
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = answerList.get(i);
            return answer;
    }
    //Collections.sort(answerList);
    
    public void combination(String order, String others, int count) {
        // 탈출 조건
        if(count == 0){
            hashMap.put(order, hashMap.getOrDefault(order, 0) +1);
            return;
        }
        for(int i=0; i<others.length(); i++)
            combination(order + others.charAt(i), others.substring(i+1) , count -1);
        // 수행 동작 : 0부터 length까지 조합
    }
}
