package basic02_api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		
		do {
			System.out.print("�̸���=");
			String email = scan.nextLine();
			// @ �־�� �Ѵ�, .�־���Ѵ�
			int atMark = email.indexOf("@");
			int point = email.indexOf("."); // sdadsa@f.natecom
			
			if(atMark<3 || point<atMark || Math.abs(atMark-point)<=2) {//�߸��� �̸��� ã��
				System.out.println(email+"�� �߸��� �����Դϴ�.");
			}else {//�����̸��� �϶�
				// split(), substring, StringTokenizer
				/* split
				String emailSplit[] = email.split("@");
				System.out.println("���̵�="+ emailSplit[0]);
				System.out.println("������="+ emailSplit[1]);
				*/
			/* substring()
				String id = email.substring(0, atMark);
				String domain = email.substring(atMark+1);
				System.out.println("id="+ id);
				System.out.println("domain="+ domain);
			*/
			//StringTokenizer
				StringTokenizer emailobj = new StringTokenizer(email, "@");
				String id = emailobj.nextToken();
				String domain = emailobj.nextToken();
				System.out.println("id="+ id);
				System.out.println("domain="+ domain);
			}
			
			System.out.println("����Ͻðڽ��ϱ�(y:��, n: �ƴϿ�)?");
			//String q = scan.nextLine();
			if(!scan.nextLine().equalsIgnoreCase("y")) {
				System.out.println("The End...");
				break;
			}
			
		}while(true);
			

	}

}
/*
����

�̸���=fjfkdjfkd@nate.com
���̵�=fjfkdjfkd
������=nate.com
�ٽ��Ͻðڽ��ϱ�(y.��, n.�ƴϿ�)?y

�̸���=addd.com



*/