package basic02_api;

import java.util.Scanner;

public class ForEx03HW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 수=");
		int num = scan.nextInt();
		
		int even=0;
		int odd=0;
		for(int i=1 ; 101>i; i++) 
	         if(i%2==0) {
	             even = even+i;
	         }
	         else {
	             odd = odd+i;
	         }             
		 System.out.println("1~100까지의 합은" + (even+odd));
	     System.out.println("1~100까지의 홀수합은" + odd);
	     System.out.println("1~100까지의 짝수합은" + even);
	}

}
