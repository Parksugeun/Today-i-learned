import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구분
        HashMap<String, Integer> map = new HashMap<>();
        for(String [] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가해서 모든 조합을 계산
        Iterator<Integer> iter = map.values().iterator();
        int answer =1;

        while(iter.hasNext())
            answer *= iter.next().intValue() + 1; // iterator가 가져고 있는 데이터가 integer 이기 때문에 intValue 사용
        // 3. 아무종류의 옷도 입지 않는 경우를 제외

        return answer - 1;
    }
}