import java.util.Scanner;

public class B2750_수정렬하기 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // N(정렬할 수 개수), A(정렬할 배열) 선언
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    // N-1까지 반복하면서
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < N - 1 - i; j++) {
        // N-1-i 만큼 현재 A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
        if (A[j] > A[j + 1]) {
          int temp = A[j];
          A[j] = A[j + 1];
          A[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      System.out.println(A[i]);
    }
  }
}
