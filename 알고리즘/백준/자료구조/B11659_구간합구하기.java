import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11659_구간합구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bufferedReader.readLine());
        
        // 숫자 개수와 질의 개수 저장
        int num = Integer.parseInt(str.nextToken());
        int que = Integer.parseInt(str.nextToken());
        long[] S = new long[num + 1];
        str = new StringTokenizer(bufferedReader.readLine());
        // 숫자 개수만큼 반복하며 합배열 생성
        for(int i = 1; i <= num; i++) {
            S[i] = S[i - 1] + Integer.parseInt(str.nextToken());
        }
        // 질의 개수만큼 반복하며 질의 범위를 받기
        for(int q = 0; q < que; q++) {
            str = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(str.nextToken());
            int j = Integer.parseInt(str.nextToken());
            // 구간합 출력
            System.out.println(S[j] - S[i-1]);  
        }        
        bufferedReader.close();
    }
}
