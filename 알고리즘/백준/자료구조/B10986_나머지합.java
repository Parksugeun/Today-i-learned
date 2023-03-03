import java.io.IOException;
import java.util.Scanner;

public class B10986_나머지합 {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    // N(수열의 개수)입력받기 , M(나누어떨어져야 하는 수)입력받기
    int N = sc.nextInt();
    int M = sc.nextInt();
    // S(합배열)선언하기, C(같은 나머지의 인덱스를 카운트하는 배열)선언하기
    long[] S = new long[N];
    long[] C = new long[M];
    long answer = 0;
    S[0] = sc.nextInt();
    // 1부터 N만큼 합배열 저장하기
    for (int i = 1; i < N; i++) { //수열 합 배열 만들기
      S[i] = S[i - 1] + sc.nextInt();
    }
    // 0부터 N만큼 합배열의 모든 값에 % 연산 수행하기
    for (int i = 0; i < N; i++) { // 합 배열의 모든 값에 % 연산 수행하기
      int remainder = (int) (S[i] % M);
      // 0~i까지의 구간 합 자체가 0일 때 정답에 더하기
      if (remainder == 0) {
        answer++;
      }
      // 나머지가 같은 인덱스의 개수 카운팅하기
      C[remainder]++;
    }
    // 0부터 M만큼 i가 나머지인 인덱스의 개수에서 2가지를 뽑는 경우의 수를 정답에 더하기
    for (int i = 0; i < M; i++) {
      if (C[i] > 1) {
        // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
        answer = answer + (C[i] * (C[i] - 1) / 2);
      }
    }
    // 결과값 출력
    System.out.println(answer);
  }
}
