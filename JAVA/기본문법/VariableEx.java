import java.util.Scanner;

public class VariableEx {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
	
		// ����� ������ �ٱ��� ũ�⸦ �Է¹޾� 
		// �ٱ��Ͽ� ����� ���� ��� �ѹٱ��Ͽ��� ����� 10���� ���� �� �ִ�.
		// ����� 31���϶� �ٱ��� ���� ���϶�.
		System.out.print("�ٱ��� ũ��=");
		int basketSize = inData.nextInt(); 
		System.out.print("�������=");
		int apple = inData.nextInt();
	
		
		int basket = (apple%basketSize==0)? apple/basketSize: apple/basketSize+1;
		System.out.println("�ٱ��ϼ�:"+ basket);
		
		

		
				
				
				
				
				
				
				
				

				
	}

}
