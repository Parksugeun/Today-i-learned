
public class Variable01 {
     ////�������=��������
	int t=500;
	//�޼ҵ�
	//Ŭ����
	public static void main(String[] args) {
		// ������ ���
		// ���� ������Ģ
		//1. �ҹ���, _, $�� �����Ѵ�.
		//2. ���� ��ҹ���, _, $, ���ڸ� ����Ѵ�.
		//3. �ռ����� ��� �ι�° �ܾ���� ù��° ���ڴ� �빮�ڷ� �Ѵ�. multicampusKorea, MulticampusKorea, MulticampustKorea,
		//4. ������ ���̴� 256���ڱ��� ����Ѵ�.
		
		byte kor = 80;
		int eng = 90;
		short mat = 75;
		
		// type casting : ����ȯ
		int tot = kor + eng + mat;
		
		System.out.println("����="+ kor); // ���ڿ��� � ���������� ���ϵ��� ���ڿ��� �ȴ�.	
		System.out.println("����="+eng);
		System.out.println("����="+mat);
		
		System.out.println("����="+tot);
	
	}

}
