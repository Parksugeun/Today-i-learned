import java.util.Scanner;

public class B1546_평균 {

    public static void main(String[] args) {
        //변수 N에 과목수 입력 받기
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        //길이가 N인 1차월 배열 A[]선언하기
        int A[] = new int [N];
        //배열 A[]의 길이만큼 반복하며 각 점수 배열에 저장하기
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        //배열 A[]의 길이만큼 반복하며 최고점은 max에 총합은 sum에 저장하기
        long sum = 0;   //실수(예제 출력에 소수점 포함) 
        long max = 0;
        
        for(int i = 0; i<N; i++){
            if(A[i]>max) max = A[i];
            sum = sum + A[i];
        }
        //sum * 100 / max / N 출력하기
        System.out.println(sum * 100.0 / max / N);
    }
}