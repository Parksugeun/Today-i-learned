import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//������ �迭�� ����
		String title[] = {"����","����","����","����","����","��������"};
		int jumsu[] = new int[title.length];//����, ����, ����, ����

		for(int i=0; i<title.length; i++) {//0,1,2,3
			System.out.print(title[i]+"����=");
			jumsu[i] = scan.nextInt();
			
		
		}
		//���� 
		int tot=0;
		for(int i=0; i<jumsu.length; i++) {
			tot += jumsu[i];
		}
		//���
		int ave = tot / title.length;
	
		System.out.println("����="+ tot);
		System.out.println("���="+ ave);
	}
	
}
/* ������
* ��������=80
* ��������=90
* ��������=80
* ����=250
* ���=
* 
* */