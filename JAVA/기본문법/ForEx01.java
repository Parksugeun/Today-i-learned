import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(;;) {//�ݺ�
		System.out.print("���Է�=");
		int dan = scan.nextInt();
		if(dan>=2 && dan<=9) {//������
			for(int i=2; i<=9; i++) {
				int result = dan * i;
				System.out.printf("%4d * %4d = %4d\n", dan, i, result);
			}
		}else {
			System.out.println("���� �߸��Է��Ͽ����ϴ�.");
		}
	}
		
		
		
		
		
		
	}

}
/*
2~9���� ���� �Է��� ��� ���� �߸��Է��Ͽ��ٴ� �޼���

����
��=6
6*2=12
6*2=18
:
:
6*9=54





*/