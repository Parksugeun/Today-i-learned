import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("����=");
		int age = scan.nextInt();
		
		System.out.print("����(1:����, 2:����)=");
		int sex = scan.nextInt();
		System.out.print("Ű=");
		int height = scan.nextInt();
		System.out.print("����ü��=");
		int weight = scan.nextInt();
		
		
		if(age>=35 && sex==1) {
			double avew = (height-100)*0.90;
		}
		if(age>=35 && sex==2) {
			double avew = (height-100)*0.85;
			}
		if(age<=36 && sex==1) {
			double avew = (height-100)*0.95;
		}
		if(age<=36 && sex==2) {
			double avew = (height-100)*0.90;
		}
		System.out.print("ǥ��ü��="+(double)avew);
		
		double avewIndex = (weight/(double)avew)*100;
		
				
		System.out.print("����� ǥ��ü��������"+ avewIdex +"����"+ grade + "�Դϴ�");
		
		String grade;
		
		if(double avewIndex>=85) {
			grade = "������";	
		}
		if(86<=double avewIndex<=95) {
			grade = "���ݸ�����";
		}
		if(96<=double avewIndex<=115) {
			grade = "ǥ����";
		}
		if(116<=double avewIndex<=125) {
			grade = "���� ����";
		}
		if(126<=double avewIndex) {
			grade = "����";
		}
			
		
			
	}

}
