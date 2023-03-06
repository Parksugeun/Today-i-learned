import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940_주몽의명령 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // N(재료의 개수) 저장, M(갑옷이 되는 번호)저장
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    // N 만큼 반복하며 재료 배열 저장하기
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    // 재료 배열 오름차순 정렬
    Arrays.sort(A);
    int count = 0;
    int i = 0;
    int j = N - 1;
    // 양쪽 끝에 위치한 i 와 j가 i<j 일 동안
    while (i < j) {
      // 재료 합 < M 이면 작은 번호 재료를 한 칸 위로 변경
      if (A[i] + A[j] < M) {
        i++;
      } else if (A[i] + A[j] > M) { // 재료합 > M 이면 큰 번호 재료를 한 칸 아래로 변경
        j--;
      } else { // 재료합 = M 이면 count 증가 양쪽 index 값 변경 i++ j--
        count++;
        i++;
        j--;
      }
    }
    System.out.println(count);
    br.close();
  }
}
