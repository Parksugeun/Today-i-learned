import java.util.Scanner;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		   ������ ������ �Է¹޾� 1~100������ ���̸� 
		   �Է¹��� ���� 100�� ���Ͽ� ����ϰ� 
		   �� ���� ���� 0�� ����϶�.
		
	*/
		Scanner scan = new Scanner(System.in);
		// ������
		System.out.print("����=");
		int number = scan.nextInt();
		int result = (number>=1 && number<=100)? number*100 : 0;
		// ���
		System.out.print(result);
		// ���

	}

}
