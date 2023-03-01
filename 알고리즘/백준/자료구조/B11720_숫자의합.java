package 백준.자료구조;

import java.util.Scanner;
 
public class B11720_숫자의합 {
	public static void main(String[] args) {		
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray(); // toCharArray(); >> String문자열을 char 배열로 변환해줌 
        sc.close();
        int sum= 0;
        
        for(int i=0; i< cNum.length; i++){
            sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적
        }
        System.out.print(sum);
        
	}
}
