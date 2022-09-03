import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//�ζǹ�ȣ ������
		do {
			System.out.print("���Ӽ�=");
			int cnt = scan.nextInt();
			
			
			for(int i=1; i<=cnt; i++) {// 1,2,3,4,5,...,cnt
				// 2
				int lotto[] = new int [7];//�ζǹ�ȣ + ���ʽ�
				
				for(int j=0; j<lotto.length; j++) {// 0,1,2,3,4,5,6
					lotto[j] = random.nextInt(45) +1;//��ȣ���� 1~45
					
					//���� ��ȣ ������ ������� ��ȣ�� ��������� ��ȣ�� ���� ���� �ִ� �� �ߺ��˻�
					//       0   0<1
					for(int c=0; c<j; c++) {
						//       1        	 0
						if(lotto[j] == lotto[c]) {
							j--; // 1 -> 0
							break;
						}
					}
				
				}
				// ���� ����(���ʽ��� ��������)
				Arrays.sort(lotto, 0, 6); //index�� 0~6 ������ȣ������ ���ĵȴ�.
				//System.out.println(Arrays.toString(lotto));
				System.out.println(i+"����="+ Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)) + ", bonus="+lotto[6]);
				
		
				
			}
			System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?");
			int qna = scan.nextInt();
			
			if(qna!=1)break; // 1���� ���� ������ ���α׷� ����
			
			
		}while(true);
		
		
		
		
	}

}
