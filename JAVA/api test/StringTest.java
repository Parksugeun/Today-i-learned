package basic02_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String name2 = "ȫ�浿";
		
		String addr = new String("Seoul ������ ������ ���ﵿ(DONG)");
		String addr2 = new String("����� ������ ���ﵿ(dong)");
		
		// == : ������
		if(name == name2) {
			System.out.println("name�� name2�� ����");
		}else {
			System.out.println("name�� name2�� �ٸ���");
		}
		if(addr == addr2) {
			System.out.println("addr�� addr2�� ����");
		}else {
			System.out.println("addr�� addr2�� �ٸ���");
		}
		
		String addr3 = addr2;
		if(addr2== addr3) {
			System.out.println("addr2 �� addr3�� ����");
		}else {
			System.out.println("addr2 �� addr3�� �ٸ���");
		}
		
		// equals() : ��ü���� ���� �����ش�. (��ҹ��� ����)
		boolean boo = addr.equals(addr2); // addr2.equals(addr)
		if(boo) {
			System.out.println("addr�� addr2�� ����...");
		}else {
			System.out.println("addr�� addr2�� �ٸ���...");
		}
		// equalsIgnoreCase() : ���� �����ش�.(��ҹ��ڸ� �������� �ʴ´�.)
		if(addr.equalsIgnoreCase(addr2)) {
			System.out.println("����(��ҹ��ڱ�������)");
		}else {
			System.out.println("�ٸ���(��ҹ��ڱ�������");
		}
		
		String str = "A";
		str = str + "B";
		String str2 = str + 100;
		
		System.out.println("charAt()->"+ addr.charAt(5)); //index��ġ�� ���ڸ� ��ȯ�Ѵ�.
		addr = addr.concat(name);
		System.out.println("concat()->" + addr);//���ڿ���
	
		
		String txt = "Hello!";
		byte txtCode[] = txt.getBytes();
		System.out.println(Arrays.toString(txtCode));
	
		
		// ���� �����϶� -1
		int idx = addr.indexOf("������"); // ����� ������ ������ ���ﵿ(DONG)
		System.out.println("indexOf->"+idx);
		System.out.println("lastIndexOf->"+ addr.lastIndexOf("��"));
		System.out.println("indexOf->"+ addr.indexOf("��",5));
		System.out.println("length->"+ addr.length());
		System.out.println("repeat->" + addr.repeat(3));
		System.out.println("*".repeat(50));
		
		addr = addr.replaceAll("������", "GangNamGu");
		System.out.println("replaceAll->"+ addr);
	
		String tel = "010-1234-5678";
		String telSplit[] = tel.split("-");
		System.out.println(Arrays.toString(telSplit));
		//         0123456789012345678901234
		// addr -> Seoul GangNamGu GangNamGu ���ﵿ(DONG)ȫ�浿
		// substring : ���ڿ����� �Ϻ��� ���ڿ��� ���� �� 
		String sub1 = addr.substring(6, 15);//������ġ 6, ����ġ 14
		System.out.println("substring(int, int)->"+ sub1);
		String sub2 = addr.substring(20);
		System.out.println("substring(int)->"+ sub2);
		
		System.out.println("lower->"+ addr.toLowerCase());
		System.out.println("upper->"+ addr.toUpperCase());
		// "2500"
		// "5.3"
		String x = String.valueOf(5.3)+ 500;
		System.out.println(x);
	
		char c[] = {'j','a','v','a'};// "Java"
		System.out.println(c);
		System.out.println(String.valueOf(c));
		
		int d[] = {23,45,67,88};
		System.out.println(d);
		
		String data = "         Test          Programing     ";
		System.out.println("data->"+ data.trim()+"?");//���� ���� ���鹮�ڸ� �����.
	}

}
