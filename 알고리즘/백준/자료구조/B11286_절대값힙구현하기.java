import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B11286_절대값힙구현하기 {

  // N의 최대 범위가 1000,000으로 O(nlogn) 시간 복잡도로 풀 수 있다.
  // 절댓값 정렬이 필요하므로 우선순위 큐의 정렬 기준을 직접 정의해야 한다.
  // 1. x = 0일 때 큐가 비어 있을 때는 0을 출력하고 비어 있지 않을 때는 절댓값이 최소인 값을 출력한다. 단, 절댓값이 같다면 음수를 우선하여 출력한다.
  // 2. x = 1일 때 add로 큐에 새로운 값을 추가하고 우선순위 큐 정렬 기준으로 자동 정렬한다.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
      int first_abs = Math.abs(o1);
      int second_abs = Math.abs(o2);
      if (first_abs == second_abs) return o1 > o2 ? 1 : -1; // 절대값이 같으면 음수 우선 정렬하기
      else return first_abs - second_abs; // 절대값을 기준으로 정렬하기
    });
    for (int i = 0; i < N; i++) {
      int request = Integer.parseInt(br.readLine());
      if (request == 0) {
        if (MyQueue.isEmpty()) System.out.println("0"); else System.out.println(
          MyQueue.poll()
        );
      } else {
        MyQueue.add(request);
      }
    }
  }
}
