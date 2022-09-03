import java.util.Calendar;
import java.util.Scanner;

public class ConsoleCalender {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
		
			System.out.println("�⵵=");
			int year = scan.nextInt();
			
			System.out.print("��=");
			int month = scan.nextInt();
		
			if(month>=1 && month<=12) {	
			
				System.out.printf("\t\t%d�� %d��\n", year, month);
				System.out.println("��\t��\tȭ\t��\t��\t��\t��");
				
				Calendar date = Calendar.getInstance();//���ó�¥�� �ð�
				date.set(year, month-1, 1);//�Է¹��� ����� ����
				
				int week = date.get(Calendar.DAY_OF_WEEK);//���ϱ��ϱ� 1->��, 2->�� ...
		
				//��������
				// 30 :4, 6, 8, 10, 12
				// 31 :1, 3, 5, 7, 9, 11
				/*
				int lastDay = 31;
				switch(month) {
				case 4: 
				case 6: 
				case 9:
				case 11: lastDay = 30;break;
				case 2://2��
					// �⵵�� 4�� ����̰� 100���� �������� ���� �� ����(29��)
					// �⵵�� 400�� ����̸� ����(29��)
					if(year%4==0 && year%100!=0 || year%400==0) {
						lastDay = 29;
					}else {
						lastDay =28;
					}
					break;
				default:
					lastDay = 31;
				}
				*/
				int lastDay =date.getActualMaximum(Calendar.DAY_OF_MONTH); //Calendar.DATE//��������
				int y =date.getActualMaximum(Calendar.YEAR);
				
				
				//�޷����
				//����
				for(int space=1; space<week; space++) {
					System.out.print("\t");
				}
				//��¥
				for(int day = 1; day<=lastDay; day++) {
					System.out.print(day+"\t");
					//1�ٿ� 7(������� ��¥����)���� ��µǸ� �ٹٲٱ�
					if((week-1+day)%7==0) {
						System.out.println();
					}
				}
				System.out.println();
			}else {
			System.out.println("���� �߸��Է��Ͽ����ϴ�.");
		}
		
	}

	}
}
