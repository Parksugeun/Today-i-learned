package basic05_collection;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//로또번호 생성기
		do {
			System.out.print("게임수=");
			int cnt = scan.nextInt();
			
			
			for(int i=1; i<=cnt; i++) {// 1,2,3,4,5,...,cnt
				TreeSet<Integer> lotto = new TreeSet<Integer>();//번호 7개를 저장할 객체
				int lastNum=0;//마지막으로 생성된 번호 기억하기 위한 변수
				while(lotto.size()<7) {
					lastNum = random.nextInt(45-1+1)+1;
					lotto.add(lastNum);
				}
				
				//마지막으로 만든 번호를 보너스로 사용하기 위해 컬렉션에 있는 마지막 번호를 지운다.
				lotto.remove(lastNum);
				System.out.println(i+"게임="+ lotto.toString()+", bonus="+lastNum);
			}
			System.out.print("계속하시겠습니까(1.예, 2.아니오)?");
			int qna = scan.nextInt();
			
			if(qna!=1)break; // 1외의 값이 들어오면 프로그램 종료
			
			
		}while(true);
		
		
		
		
	}

}
