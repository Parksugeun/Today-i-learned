import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1253_좋은수구하기 {

  // N의 개수가 최대 2000이라고 해도 시간 복잡도는 N제곱 보다는 작아야 한다.(최종 시간 복잡도는 N세제곱이 되기 떄문) 즉 최소 O(nlogn)이어야 한다.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // N(수의 개수) 저장, A(수 데이터 저장 배열) 저장
    int N = Integer.parseInt(br.readLine());
    long A[] = new long[N];
    int Result = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    // N만큼 반복하며 A 배열에 데이터 저장하기
    for (int i = 0; i < N; i++) {
      A[i] = Long.valueOf(st.nextToken());
    }
    // A 배열 오름차순 정렬
    Arrays.sort(A);
    // k 를 0 부터 N까지 반복하며 변수 초기화 하기 (찾고자 하는 값, 포인터i, 포인터j)
    for (int k = 0; k < N; k++) {
      long find = A[k];
      int i = 0;
      int j = N - 1;
      // i<j 동안
      while (i < j) {
        if (A[i] + A[j] == find) { // find는 서로 다른 두수의 합이어야 함을 체크
          if (i != k && j != k) { // i,j가 k가 아닐떄 결과 값에 반영 하고 while문 종료
            Result++;
            break;
          } else if (i == k) { // i,j가 k가 맞을 때 포인터 변경 및 계속
            i++;
          } else if (j == k) {
            j--;
          }
        } else if (A[i] + A[j] < find) { // A[i]+ A[j] < 찾고자 하는 값 일 때  포인터 i 증가
          i++;
        } else { // A[i]+ A[j] > 찾고자 하는 값 일 때  포인터 j 감소
          j--;
        }
      }
    }
    System.out.println(Result);
    br.close();
  }
}
