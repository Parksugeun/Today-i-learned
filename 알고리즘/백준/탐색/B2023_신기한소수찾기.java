import java.util.Scanner;

public class B2023_신기한소수찾기 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        // 일의 자리 소수는 2, 3, 5, 7이므로 4개 수에서만 시작
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }
    static void DFS(int number, int jarisu){
        if(jarisu == N){
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }
        for(int i =1; i < 10; i++){
            if(i % 2 == 0){ // 짝수라면 더 이상 탐색할 필요가 없음
                continue; 
            }
            if(isPrime(number * 10 +i)){ // 소수라면 재귀 함수로 자릿수를 늘림
                DFS(number * 10 + i, jarisu + 1);
            }
        }
    }
    static boolean isPrime(int num){
        for(int i =2; i <=num / 2; i++){
            if(num % i == 0)
                return false;
            return true;    
    }
}
