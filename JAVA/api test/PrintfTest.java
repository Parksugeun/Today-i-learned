package basic02_api;

public class PrintfTest {

	public static void main(String[] args) {
		//��½� ���ڿ� �Ǵ� ���ڸ� �ڸ����� �����Ͽ� ����� �� �ִ�.
		
		//InputStreamŬ������ print(), println(), printf()
		
		//����� : \", \', \t, \n
		//		���� �̸��� ȫ�浿�Դϴ�.
		//		���� �̸��� "ȫ�浿"�Դϴ�.
		System.out.println("���� �̸���\n \"ȫ�浿\"�Դϴ�.");
		
		int a = 125;
		double b = 235.2356485;
		String name = "ȫ�浿";
		System.out.println(a);
		//			pattern, ����
		//			���� : %d, �Ǽ�: %f, ���ڿ� : %s, 1����:%c
		System.out.printf("a������ ���� %-10d�Դϴ�.\n", a);//�ٹٲ� ����
		System.out.printf("%10.3f\n", b);
		System.out.printf("���� �̸��� \"%5s\"�Դϴ�.", name);
		System.out.printf("\n%5s", "ABC");
		System.out.printf("\n%5c", 'Z');
		
		System.out.printf("\na=%5d, b=%7.2f, name=%s",a,b,name);
	}

}
