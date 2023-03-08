import java.util.Scanner;

public class B1427_내림차순으로자릿수정렬하기 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // str(정렬할 수) A(자릿수별로 구분해 저장한 배열) 선언
    String str = sc.next();
    int A[] = new int[str.length()];
    // str의 길이만큼 반복하며 A 배열 저장 -> str.substring 사용하기
    for (int i = 0; i < str.length(); i++) {
      A[i] = Integer.parseInt(str.substring(i, i + 1));
    }
    for (int i = 0; i < str.length(); i++) { // str의 길이만큼 반복하기
      int Max = i;
      for (int j = i + 1; j < str.length(); j++) { // j= i+1 ~ str의 길이만큼 반복하며 Max 값 찾기
        if (A[j] > A[Max]) Max = j; // 내림차순이므로 최댓값을 찾음
      }
      if (A[i] < A[Max]) { // 현재 i의 값과 Max 값 중 Max 값이 더 크면 swap 수행하기
        int temp = A[i];
        A[i] = A[Max];
        A[Max] = temp;
      }
    }
    for (int i = 0; i < str.length(); i++) {
      // A 배열 출력
      System.out.print(A[i]);
    }
  }
}
