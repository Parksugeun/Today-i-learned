import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164_카드게임 {

  // 1. poll을 수행하여 맨 앞의 카드를 버린다.
  // 2. 과정 1에 이어 바로 add를 수행해 맨 앞에 있는 카드를 가장 아래로 옮긴다.
  // 3. 큐의 크기가 1이 될 때까지 1~2 과정을 반복한 후 큐에 남은 원소를 출력한다.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> myQueue = new LinkedList<>();
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) { // 카드를 큐에 저장하기
      myQueue.add(i);
    }
    while (myQueue.size() > 1) { // 카드가 1장 남을 때까지
      myQueue.poll(); // 맨 위의 카드를 버림
      myQueue.add(myQueue.poll()); // 맨 위의 카드를 가장 아래 카드 밑으로 이동
    }
    System.out.println(myQueue.poll()); // 마지막으로 남은 카드 출력
  }
}
