package basic02_api;

public class StringBufferTest {

	public static void main(String[] args) {
		// String : ������ ���� ������ �����尡��
		// StringBuffer : ������ ���� ������(����ȭ) ����
		// StringBuilder : ������ ���� ����ȭ�� ������� ������

		//StringBuffer sb = new StringBuffer(30);
		//									01234567890123456789
		StringBuffer sb = new StringBuffer("JAVA Programing Test..........");
		sb.append("�ߵǳ�?"); //�������� ���� �߰�, sb = sb.append("fdf);   a = a + "ddd"; a+"dddd";
		sb.insert(4, "(�ڹ�)");//���ڿ��� ����
		// 012345 67890
		// JAVA(�ڹ�) Programing Test .........
		// JAVA(rograming Test..........�ߵǳ�?
		sb.delete(5, 10);//���ڿ� �����
		System.out.println(sb);
		
		//sb.reverse();
		System.out.println(sb);
		//Ȯ���� �޸� Ȯ��
		System.out.println("capacity->"+ sb.capacity());
		
		StringBuffer first = new StringBuffer("Test");
		StringBuffer second = new StringBuffer("JAVA");
		
		// equals();
		// compareTo()	: ���ڿ� ���ڸ� ���Ͽ� ������ �������ش�.
		//			 "A"			  "B"      "A-B"
		int result = first.compareTo(second);
		int result2 = second.compareTo(first);
		System.out.println("result->"+ result+", result2->"+ result2);
	 
		// 0 : �� ��ü�� �����ʹ� ����.
		// ��� : ���ʰ�ü�� �����Ͱ� ũ��.
		// ���� : ���ʰ�ü�� �����Ͱ� �۴�.
	
	}

}
