package basic02_api;

import java.util.Scanner;

public class ForEx03HW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ��=");
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
		 System.out.println("1~100������ ����" + (even+odd));
	     System.out.println("1~100������ Ȧ������" + odd);
	     System.out.println("1~100������ ¦������" + even);
	}

}
