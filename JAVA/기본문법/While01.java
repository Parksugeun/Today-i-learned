
public class While01 {

	public static void main(String[] args) {
		// while(���ǽ�) {
		//    ���๮;
		//		:
		//}
		
		int i=0;
		// i<5	
		while(i<5) {//���϶� ����
			i++;
			System.out.println(i);
			
		}
		
		System.out.println("----");
		int x=1;
		while(x<=5) {//��
			int y=1;
			while(y<=5) {//ĭ
				System.out.print(y);	
				y++;
			}
			System.out.println();
			x++;
		}
		
	}

}
