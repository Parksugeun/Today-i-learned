import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 
			���� �Է¹޾� ��, ����, ����, �ܿ��� ������ ����ϴ� ���α׷��� �ۼ��϶�.
			
			�ܿ� - 11, 12, 1, 2
			�� - 3, 4,
			���� - 5, 6, 7, 8
			���� - 9, 10
		
		
		
		*/
		System.out.print("���Է�=");
		int month = scan.nextInt();
		if(month>=1 && month<=12 ) {
			
		String season="";
		switch(month) {
		case 11:
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
			season = "��";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		default:
			season = "����";
		}
		System.out.printf("%d�� %s�Դϴ�.", month, season);
      }else {
			System.out.println("���� �߸��Է��Ͽ����ϴ�.");
		}
	}

}
