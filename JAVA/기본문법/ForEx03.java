import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의 정수=");
		int max = scan.nextInt();
		
		//합을 구해서 누적시킬변수들
		int sum=0, oddSum=0, evenSum=0;
		
		for(int i=1; i<=max; i++) {//1
			sum = sum + i;//전체합 sum += i;
			if(i%2==0) {//짝수
				evenSum += i;
			}else {//홀수
				oddSum += i;
			}
		}
		
		sum = evenSum + oddSum;
	
		System.out.println("1~"+max+"까지의 합은 "+sum);
		System.out.println("1~"+max+"까지의 홀수의 합은 "+oddSum);
		System.out.println("1~"+max+"까지의 짝수의 합은 "+evenSum);
		
	}
	

}


/*
실행
임의의 정수=100 
1~100까지의 합은 5050
1~100까지의 홀수의 합은2500
1~100까지의 짝수의 합은 2550







*/