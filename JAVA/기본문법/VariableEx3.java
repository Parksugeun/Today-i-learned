import java.util.Scanner;

public class VariableEx3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�޴�(1.�簢���� ����, 2.�簢���� �ѷ�)?");
		int menu = scan.nextInt();
		
		System.out.print("����(�غ�)=");
		int width = scan.nextInt();
		
		System.out.print("����(����)=");
		int height = scan.nextInt();
		
		//���          ����  : �ѷ�
		int result = (menu==1)?  width*height : (width+height)*2;
		
		//�޼��� ���ϱ�
		String label = (menu==1)? "����" : "�ѷ�";
		
		System.out.println("�簢����" +label+"="+result);
		
	
	}
}

/*
	�簢���� ���� = ����*����
	�簢���� �ѷ� = (����+����)*2


	������
	�޴�(1.�簢���� ����, 2.�簢���� �ѷ�)? 1
	����(�غ�)=6
	����(����)=5
	�簢���� ���� = 30
	
	------------------------
	
	�޴�(1.�簢���� ����, 2.�簢���� �ѷ�)? 2
	����(�غ�)=6
	����(����)=5
	�簢���� �ѷ� = 22

*/