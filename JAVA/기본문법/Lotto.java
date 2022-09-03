import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//로또번호 생성기
		do {
			System.out.print("게임수=");
			int cnt = scan.nextInt();
			
			
			for(int i=1; i<=cnt; i++) {// 1,2,3,4,5,...,cnt
				// 2
				int lotto[] = new int [7];//로또번호 + 보너스
				
				for(int j=0; j<lotto.length; j++) {// 0,1,2,3,4,5,6
					lotto[j] = random.nextInt(45) +1;//번호생성 1~45
					
					//현재 번호 이전에 만들어진 번호와 현재생성된 번호와 같은 값이 있는 지 중복검사
					//       0   0<1
					for(int c=0; c<j; c++) {
						//       1        	 0
						if(lotto[j] == lotto[c]) {
							j--; // 1 -> 0
							break;
						}
					}
				
				}
				// 게임 정렬(보너스는 정렬제외)
				Arrays.sort(lotto, 0, 6); //index가 0~6 이전번호까지만 정렬된다.
				//System.out.println(Arrays.toString(lotto));
				System.out.println(i+"게임="+ Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)) + ", bonus="+lotto[6]);
				
		
				
			}
			System.out.print("계속하시겠습니까(1.예, 2.아니오)?");
			int qna = scan.nextInt();
			
			if(qna!=1)break; // 1외의 값이 들어오면 프로그램 종료
			
			
		}while(true);
		
		
		
		
	}

}
