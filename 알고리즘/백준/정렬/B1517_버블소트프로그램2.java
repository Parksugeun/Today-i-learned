import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1517_버블소트프로그램2 {

  public static int[] A, temp;
  public static long result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 정렬할 수 개수, 정렬할 배열 선언하기, 정렬할 때 사용할 임시 배열 선언
    int N = Integer.parseInt(br.readLine());
    A = new int[N + 1];
    temp = new int[N + 1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    result = 0;
    merget_sort(1, N); // 병합 정렬 수행하기
    System.out.println(result);
  }

  private static void merget_sort(int s, int e) {
    if (e - s < 1) return;
    int m = s + (e - s) / 2;
    // 재귀 함수 형태로 구현하기
    merget_sort(s, m);
    merget_sort(m + 1, e);
    for (int i = s; i <= e; i++) {
      temp[i] = A[i];
    }
    int k = s;
    int index1 = s;
    int index2 = m + 1;
    while (index1 <= m && index2 <= e) { // 두 그룹을 병합하는 로직
      if (temp[index1] > temp[index2]) {
        A[k] = temp[index2];
        result = result + index2 - k; // 뒤쪽 데이터 값이 작은 겨웅 result 업데이트
        k++;
        index2++;
      } else {
        A[k] = temp[index1];
        k++;
        index1++;
      }
    }
    while (index1 <= m) {
      A[k] = temp[index1];
      k++;
      index1++;
    }
    while (index2 <= e) {
      A[k] = temp[index2];
      k++;
      index2++;
    }
  }
}
