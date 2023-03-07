import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B11003_최솟값찾기 {

  public static final Scanner Scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // N(데이터 개수), L(최솟값을 구하는 범위), Deque(데이터를 담을 덱 자료구조)선언
    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    Deque<Node> mydeque = new LinkedList<>();
    // N만큼 반복하며
    for (int i = 0; i < N; i++) {
      int now = Integer.parseInt(st.nextToken());
      // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임

      // 현재데이터 값에 덱의 마지막 위치에서부터 현재 데이터 값보다 큰 값은 덱에서 제거
      while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
        mydeque.removeLast();
      }
      // 덱의 마지막 위치에 현재 데이터 값 저장하기
      mydeque.addLast(new Node(now, i));

      // 덱의 1번째 위치에서부터 L의 범위를 벗어난값(now index-L <= index)을 덱에서 제거하기
      if (mydeque.getFirst().index <= i - L) {
        mydeque.removeFirst();
      }
      // 덱의 1번째 데이터 출력하기
      bw.write(mydeque.getFirst().value + " ");
    }
    bw.flush();
    bw.close();
  }

  // 덱에 저장할 노드 클래스 별도 생성하기
  static class Node {

    // 노드 클래스에는 index(자신의 위치), value(자신의 값) 담기
    public int value;
    public int index;

    Node(int value, int index) {
      this.value = value;
      this.index = index;
    }
  }
}
