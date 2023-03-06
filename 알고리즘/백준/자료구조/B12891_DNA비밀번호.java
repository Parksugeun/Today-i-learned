import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891_DNA비밀번호 {

  // P와 S 의 길이가 1,000,000으로 매우 크기 떄문에 O(n)의 시간 복잡도 알고리즘을 사용해야함
  static int checkArr[];
  static int myArr[];
  static int checkSecret;

  public static void main(String[] args)
    throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // S(문자열 크기), P(부분 문자열의 크기), A(문자열 데이터) 저장
    int S = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    int Result = 0;
    // 비밀번호 체크 배열, 현재 상태 배열 저장
    char A[] = new char[S];
    checkArr = new int[4]; // 비밀번호 체크 배열
    myArr = new int[4];
    checkSecret = 0;
    A = br.readLine().toCharArray();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 4; i++) { // 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 변수 저장
      checkArr[i] = Integer.parseInt(st.nextToken());
      if (checkArr[i] == 0) checkSecret++;
    }
    for (int i = 0; i < P; i++) { // P(부분 문자열의 크기) 범위 만큼 S 배열에 적용하고 유효한 비밀번호인지 판단하기
      Add(A[i]);
    }
    if (checkSecret == 4) Result++;
    //슬라이딩 윈도우 처리 부분
    for (int i = P; i < S; i++) { // i를 P에서 S까지 반복하며 j 선언
      int j = i - P; // 한 칸씩 이동하면서 제거되는 문자열과 새로 들어오는 문자열을 처리하기
      Add(A[i]);
      Remove(A[j]);
      if (checkSecret == 4) Result++; // 유요한 비밀번호인지 판단해 결과값에 업데이트 하기
    }
    //결과값 출력하기
    System.out.println((Result));
    br.close();
  }

  //별도 함수 -> 문자더하기 함수, 문자 빼기 함수
  private static void Add(char c) { // 새로 들어온 문자를 처리하는 함수
    switch (c) {
      case 'A':
        myArr[0]++;
        if (myArr[0] == checkArr[0]) checkSecret++;
        break;
      case 'C':
        myArr[1]++;
        if (myArr[1] == checkArr[1]) checkSecret++;
        break;
      case 'G':
        myArr[2]++;
        if (myArr[2] == checkArr[2]) checkSecret++;
        break;
      case 'T':
        myArr[3]++;
        if (myArr[3] == checkArr[3]) checkSecret++;
        break;
    }
  }

  private static void Remove(char c) { // 제거되는 문자를 처리하는 함수
    switch (c) {
      case 'A':
        if (myArr[0] == checkArr[0]) checkSecret--;
        myArr[0]--;
        break;
      case 'C':
        if (myArr[1] == checkArr[1]) checkSecret--;
        myArr[1]--;
        break;
      case 'G':
        if (myArr[2] == checkArr[2]) checkSecret--;
        myArr[2]--;
        break;
      case 'T':
        if (myArr[3] == checkArr[3]) checkSecret--;
        myArr[3]--;
        break;
    }
  }
}
