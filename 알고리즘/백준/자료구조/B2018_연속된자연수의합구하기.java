import java.util.Scanner;

// N의 최댓값이 10,000,000임으로 O(nlogn) 시간 복잡도 알고리즘 대신 O(n) 시간 복잡도 알고리즘을 사용해야 한다.
public class B2018_연속된자연수의합구하기 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // N 변수 저장
    int N = sc.nextInt();
    // 사용 변수 초기화()
    int count = 1;
    int start_index = 1;
    int end_index = 1;
    int sum = 1;

    while (end_index != N) {
      if (sum == N) { // 현재 연속 합이 N과 같은 경우
        count++;
        end_index++;
        sum = sum + end_index;
      } else if (sum > N) { // 현재 연속 합이 N보다 큰 경우
        sum = sum - start_index;
        start_index++;
      } else { // 현재 연속 합이 N 보다 작은 경우
        end_index++;
        sum = sum + end_index;
      }
    }
    System.out.println(count);
  }
}
