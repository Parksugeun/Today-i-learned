
public class Array05 {

	public static void main(String[] args) {
		// 2���� �迭�� �ʱⰪ �����ϱ�
		
		int jumsu[][] = new int [][] {{8,9,3},
									  {90,73,81},
									  {50,9,80}};
		int data[][] = { {90,50,60},
						 {50,50,60},
						 {90,80,70},
						 {80,90,50}};
		
		System.out.println("����\t����\t����\t����\t���");
		
		//Ȯ��� �ݸ�
		// ������Ÿ�� ����	:	�迭, �÷���
		for(String t : args) {
			System.out.print(t+"\t");
		}
		for(int row=0; row<data.length; row++) {
			
			int tot=0;
			for(int col=0; col<data[row].length; col++) {
				System.out.print(data[row][col]+"\t");
				tot += data[row][col];
			}
			//���
			int ave = tot/3;
			System.out.print(tot+"\t"+ave);
			System.out.println();
		}
	}

}
