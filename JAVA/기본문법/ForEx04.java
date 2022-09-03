import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 수=");
		int num = scan.nextInt();

		int hap=0;
		for(int i=1; ; i++) {
			hap+= i;//hap =hap+i;
			if(hap>=num) {
				System.out.printf("1~%d까지의 합은 %d\n", i, hap);
				break;
			}
			
		}
		// hap(o), i(x) 
	}	 	 

}

/*
1+2+3+4...+? = 25326
실행결과
임의의 수 = 25326
1~____ 까지의 합은 25400



*/