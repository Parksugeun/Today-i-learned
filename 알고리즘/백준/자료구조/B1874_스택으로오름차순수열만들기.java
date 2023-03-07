import java.util.Scanner;
import java.util.Stack;

public class B1874_스택으로오름차순수열만들기 { // 스택에 넣는 값은 오름차순 정렬이여야 한다는 것에 유념

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // N(수열의 개수) A[](수열 배열) 선언
    int N = sc.nextInt();
    int[] A = new int[N];
    // 수열 배열 채우기
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Stack<Integer> stack = new Stack<>();
    StringBuffer bf = new StringBuffer();
    int num = 1; //오름차순 수
    boolean result = true;
    // 배열 A만큼 반복하며
    for (int i = 0; i < A.length; i++) {
      int seq = A[i]; //현재 수열의 수
      if (seq >= num) { // 현재 수열 값 >= 오름차순 자연수일 경우
        while (seq >= num) { // 값이 같아질 때까지 push
          stack.push(num++);
          bf.append("+\n");
        }
        // 나머진 pop
        stack.pop();
        bf.append("-\n");
      } else { // 현재 수열 값 < 오름차순 자연수: pop()을 수행해 수열 원소를 꺼냄
        int n = stack.pop();
        // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
        if (n > seq) {
          // 스택 pop 결과값 > 수열의 수일경우 NO 출력
          System.out.println("NO");
          result = false;
          break;
        } else { // 아니면 - 저장
          bf.append("-\n");
        }
      }
    }
    // NO가 없으면 저장한 값 출력
    if (result) System.out.println(bf.toString());
    sc.close();
  }
}
