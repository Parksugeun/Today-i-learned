import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//����, ����, �����Է¹޾� ����, ���, ������ ���϶�.
		// �� if ����� switch������ �ۼ��϶�
		Scanner scan = new Scanner(System.in);
	
			int kor, eng, mat, tot;
			double ave;
			
			System.out.println("��������=");
			kor = scan.nextInt();
			System.out.println("��������=");
			eng	= scan.nextInt();
			System.out.println("��������=");
			mat	= scan.nextInt();
			
			tot = kor + eng + mat;
			
			ave	= (double)tot / 3;
			
			String grade="";
			switch ((int)(ave/10)) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
			
			}
			
			System.out.printf("����->%d\n ���->%.2f\n ����->%s\n", tot, ave, grade);
			
	}

}
