import java.util.Scanner;

public class IfElselfEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1. ����, ����, ��������
		int kor, eng, mat, tot;
		double ave;
		String grade;
		
		System.out.println("��������=");
		kor = scan.nextInt();
		System.out.println("��������=");
		eng	= scan.nextInt();
		System.out.println("��������=");
		mat	= scan.nextInt();
		
		//����
		tot = kor + eng + mat;
		//���
		ave	= (double)tot / 3;
		//����
		
		if(ave>=90) {
			grade = "A";
			
		}else if(ave>=80) {
			grade = "B";
			
	 	}else if(ave>=70) {
			grade = "C";	

		}else if(ave>=60) {
			grade = "D";
		
		}else {	
			grade = "F";
		}
		
		/*if(ave>=90 && ave<=100) {
			grade = "A";
		}
		if(ave>=80 && ave<90) {
			grade = "B";
		}
		if(ave>=70 && ave<80) {
			grade = "C";
		}
		if(ave>=60 && ave<70) {
			grade = "D";	
		}
		if(ave>=0 && ave<60) {
			grade = "F";
				}
		*/
		
		System.out.println("����="+ tot);
		//System.out.println("���="+ ave);
		//����� �Ҽ����� 2�ڸ����� ����϶�.
		System.out.printf("���=%.2f\n",ave);
		System.out.println("����="+ grade);
	}
			}
		
			

/*
 * 90~100	A 	String "A", Char 'A'
 * 80~89	B
 * 70~79	C
 * 60~69	D
 * 0~59		F
 * ������
 * ��������=80
 * ��������=90
 * ��������=80
 * ����=250
 * ���=
 * ����= B
 * 
 * 
 */