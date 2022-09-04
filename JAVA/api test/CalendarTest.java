package basic02_api;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar Ŭ���� new�� ��ü ������ �� �� ����.
		// getInstance()�޼ҵ带 �̿��Ͽ� ��ü�� ���Ѵ�.
		
		Calendar now = Calendar.getInstance();
		
		//��¥ �����ϱ�
		//now.set(2023, 5, 12);
		//now.set(2022,10, 2, 10, 25);
		//now.set(2022, 9, 5, 10, 56,12);
		now.set(Calendar.YEAR, 2021);
		
		// Calendar��ü���� ��¥ �Ǵ� �ð������� ������
		// 2022-06-03(��) 17:15
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;//0->1��, 1->2��, 2->3��...
		int day = now.get(Calendar.DAY_OF_MONTH);//DAY_OF_MONTH
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		
		String weekName= "";
		switch(week) {
		case 1: weekName= "��"; break;
		case 2: weekName= "��"; break;
		case 3: weekName= "ȭ"; break;
		case 4: weekName= "��"; break;
		case 5: weekName= "��"; break;
		case 6: weekName= "��"; break;
		case 7: weekName= "��";
		}
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		System.out.printf("%d-%d-%d-(%s) %d:%d\n",year,month,day,weekName,hour,minute);
		System.out.println(now);
	}
	
	

}
