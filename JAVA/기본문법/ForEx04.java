import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ��=");
		int num = scan.nextInt();

		int hap=0;
		for(int i=1; ; i++) {
			hap+= i;//hap =hap+i;
			if(hap>=num) {
				System.out.printf("1~%d������ ���� %d\n", i, hap);
				break;
			}
			
		}
		// hap(o), i(x) 
	}	 	 

}

/*
1+2+3+4...+? = 25326
������
������ �� = 25326
1~____ ������ ���� 25400



*/