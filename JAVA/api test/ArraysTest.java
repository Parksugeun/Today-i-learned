package basic02_api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// ArraysŬ���� : �迭�� �̿��� ó���Ѵ�
		
		int data[] = {85,23,53,64,34,62,56,99,12,21};
		int data3[] = {85,23,53,64,34,62,56,99,12,21};
		//toString() : �迭�� ���� ���ڷ� ����� �������ش�.
		// [85,23,...]
		System.out.println("������="+Arrays.toString(data));
		
		//Arrays.sort(data);//������������ ����
		//Arrays.sort(data,2,6); // index 2���� 6�ձ��� ����
		//��������
		Integer data2[] = {85,23,53,64,34,62,56,99,12,21};
		Arrays.sort(data2,Collections.reverseOrder());

		System.out.println("������="+Arrays.toString(data2));
	
		//�迭�� ����
		int copy[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println("copy="+ Arrays.toString(copy));
	
		System.out.println(Arrays.equals(data, data3));
		
	}

}
