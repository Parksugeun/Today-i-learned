
public class While01 {

	public static void main(String[] args) {
		// while(조건식) {
		//    실행문;
		//		:
		//}
		
		int i=0;
		// i<5	
		while(i<5) {//참일때 실행
			i++;
			System.out.println(i);
			
		}
		
		System.out.println("----");
		int x=1;
		while(x<=5) {//줄
			int y=1;
			while(y<=5) {//칸
				System.out.print(y);	
				y++;
			}
			System.out.println();
			x++;
		}
		
	}

}
