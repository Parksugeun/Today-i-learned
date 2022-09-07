package basic05_collection;
import java.util.Calendar;
//import java.lang.System;
import java.util.Scanner;

public class ConsoleCalendarOOP {
		
	
	// 콘솔에서 년도와 월을 입력
		Scanner scan = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		//매개변수가 없는 생성자 메소드는 기술하지 않으면 컴파일러가 자동으로 넣어준다.
		ConsoleCalendarOOP(){
			//startCalendar();
	}
		//달력의 헤더 출력
		void titlePrint(int year, int month) {
			System.out.printf("\t\t%d년 %d월\n", year,month);
			System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		}
		//1일에 대한 요일
		int getWeek(int year, int month) {
			Calendar date = Calendar.getInstance();
			date.set(year, month-1, 1);
			return date.get(Calendar.DAY_OF_WEEK);
			
		}
		void spacePrint(int week) {
			for(int i=1; i<week; i++) {
				System.out.print("\t");
			}
		}
		//년도와 월입력
		int inData(String msg) {
			System.out.print(msg+"->");
			return scan.nextInt();
			
		}
		//날짜 출력
		void dayPrint(int week, int lastDay) {
			for(int d=1; d<=lastDay; d++) {
				System.out.print(d+"\t");
				if((d+week-1)%7==0) System.out.println();
			}
		}
		//
		void startCalendar() {
			//년도입력
			int year = inData("년도");
			int month = inData("월");
			//제목출력
			titlePrint(year, month);
			//요일구하기
			int week = getWeek(year, month);
			//공백처리
			spacePrint(week);
			//마지막날 구하기
			int lastDay = date.getActualMaximum(Calendar.DATE);
		
		
			//날짜 출력
			dayPrint(week, lastDay);
			
		}
		int getData() {
			int b=2;
			
				System.out.println("2");
				//return 2;
			
				System.out.println("3");
				System.out.println("4");
				return 4;
			
			
			
		}
}
