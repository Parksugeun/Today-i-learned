
public class ArrayBubbleSort {

	public static void main(String[] args) {
		// �迭�� ���� ũ������� �����ϱ�
		int arr[] = {56,84,61,15,3,78,95,42};
		
		//������
		System.out.print("������->");
		for(int i=0; i<arr.length; i++) {//0,1,2,3,4,5,6,7
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		for(int j=0; j<arr.length-1; j++) {//0,1,2,3,4,5,6
		//����               8-1-0  8-1-1 8-1-2
		for(int i=0; i<arr.length-1-j; i++) {//0,1,2,3,4,5,6
			if(arr[i] < arr[i+1]) {// 0��° ���� 1��° ���� ���Ͽ� 0��° ���� �� ũ�� ��ȯ
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		   }
		//���� ��
				System.out.print("������->\t");
				for(int i=0; i<arr.length; i++) {//0,1,2,3,4,5,6,7
					System.out.print(arr[i]+"\t");
				}
				System.out.println();
		}
		
		
	}

}
