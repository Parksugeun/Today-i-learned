import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B17298_오큰수구하기 {

  // 스택에 새로 들어오는 수가 top에 존재하는 수보다 크면 그 수는 오큰수가 된다.
  // 오큰수를 구한 후 수열에서 오큰수가 존재하지 않는 숫자에 -1을 출력해야 한다.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N]; // 수열 배열 생성
    int[] ans = new int[N]; // 정답 배열 생성
    String[] str = br.readLine().split(" ");

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(str[i]);
    }
    Stack<Integer> myStack = new Stack<>();
    myStack.push(0); // 처음에는 항상 스택이 비어 있으므로 최초 값을 push해 초기화
    for (int i = 0; i < N; i++) {
      // 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
      while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
        ans[myStack.pop()] = A[i]; // 정답 배열에 오큰수를 현재 수열로 저장하기
      }
      myStack.push(i); // 신규 데이터 push
    }
    while (!myStack.empty()) { // 반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지
      ans[myStack.pop()] = -1; // 스택에 쌓인 index에 -1을 넣고
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i = 0; i < N; i++) {
      bw.write(ans[i] + " "); // 출력한다.
    }
    bw.write("\n");
    bw.flush();
  }
}
