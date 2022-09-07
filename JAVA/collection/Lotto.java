package basic05_collection;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//�ζǹ�ȣ ������
		do {
			System.out.print("���Ӽ�=");
			int cnt = scan.nextInt();
			
			
			for(int i=1; i<=cnt; i++) {// 1,2,3,4,5,...,cnt
				TreeSet<Integer> lotto = new TreeSet<Integer>();//��ȣ 7���� ������ ��ü
				int lastNum=0;//���������� ������ ��ȣ ����ϱ� ���� ����
				while(lotto.size()<7) {
					lastNum = random.nextInt(45-1+1)+1;
					lotto.add(lastNum);
				}
				
				//���������� ���� ��ȣ�� ���ʽ��� ����ϱ� ���� �÷��ǿ� �ִ� ������ ��ȣ�� �����.
				lotto.remove(lastNum);
				System.out.println(i+"����="+ lotto.toString()+", bonus="+lastNum);
			}
			System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?");
			int qna = scan.nextInt();
			
			if(qna!=1)break; // 1���� ���� ������ ���α׷� ����
			
			
		}while(true);
		
		
		
		
	}

}
