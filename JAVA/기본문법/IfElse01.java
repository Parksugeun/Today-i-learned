import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//������ ���� 1~100���̸� ������ ���� ����ϰ�
		// 			�׿���(���(100�ʰ�), ����) ���� ����� ����� ����϶�.
		
		System.out.print("�����Է�=");
		int data = scan.nextInt();
		
		if(data>=1 && data<=100) {
			System.out.println("data->"+data);
		}else {// 100���� Ŭ��, 1���� ���� ��
			if(data<0) {//��ȣ�� ����� �����ϴ� ��
				data = -data;
			}
			data = Math.abs(data);
			System.out.println("data(else)->"+data);
		}

	}

}

/*

if(���ǹ�){
	//���ǹ��� ���϶� ���๮;
	 ;
	 ;
	  
	  
	 }else{
	  //���ǹ��� �����϶� ���๮;
	   ;
	   ;
	  }
	  
	  
	  
	 
	 */







