
public class Operator01 {

	public static void main(String[] args) {
		//��� : +, -, *(���ϱ�), /(������), %(������)
		//����+���� =  ����
		//����+�Ǽ� = �Ǽ�
		//�Ǽ�+�Ǽ� = �Ǽ�
		//�Ǽ�+���� = �Ǽ�

		int num1= 10;
		int num2= 3;
		
		int result = num1 / num2;// 3
		double result2 = num1 / (double)num2;// 3.3333333
		int result3 = (int)(num1 / (double)num2);// 3
		
		System.out.println(result+","+result2+","+result3);
		
		//���������� : ++, --
		
		int a = 10;
		
		//1����
		//a++;
		//++a;
		//a = a + 1;// a = 1 + a;
		
		a += 1;
		System.out.println("a="+a); //11
		//1����
		//a--;
		//--a;
		//a = a - 1;
		a -= 1;
		System.out.println("a="+a); // 10
		
		int b = 5;
		int r1 = b++ +100;
		System.out.println("b="+b+",r1="+r1);// 6, 105
		int r2 = ++b +100;
		System.out.println("b="+b+",r2="+r2);// 7, 107
		
		int t = 3;
		int r = 5/ ((7 + 10) % 2 - 3) + t++ * 2;
		System.out.println("t="+ t + ", r="+ r);
		
		//��(����)������ : ==, !=, >, <, >=, <=
		
		boolean r3 = b >= t ; // false
		System.out.println("r3="+ r3);
		// 10 5 4
		boolean r4 = a > b + t * 2;// false
		System.out.println("r4=" +r4);
		
		//�� ������ : &&(and)  , ||(or)
		// 1~100 ���̸� true, �ƴϸ� false        1<= data <= 100
		int data = -60;
		
		boolean r5 = data >= 1 && data <= 100;
		
		System.out.println("r5="+ r5);
		
		//���׿����� : ���� = (���ǽ�)? �� : ����;
		int x = 5;
		String r6 = (x%2==0)?"Even" : "Odd";
		
		// ¦ : *100, Ȧ : -100�� ���Ѵ�.
		int r7 = (x%2==1)? x-100 : x*100;
		System.out.println("r6="+ r6);
		System.out.println("r7="+ r7);
		
		// ��� : "Positive", ���� : "Negative", 0 : "zero"
		//                     ���     : ����, 0
		x = 0;
		String r8 = (x>0) ? "Positive" : (x<0)? "Negative" : "Zero";
		System.out.println("x="+ r8);
	}

}
