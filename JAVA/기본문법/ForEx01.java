import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(;;) {//반복
		System.out.print("단입력=");
		int dan = scan.nextInt();
		if(dan>=2 && dan<=9) {//구구단
			for(int i=2; i<=9; i++) {
				int result = dan * i;
				System.out.printf("%4d * %4d = %4d\n", dan, i, result);
			}
		}else {
			System.out.println("단을 잘못입력하였습니다.");
		}
	}
		
		
		
		
		
		
	}

}
/*
2~9외의 단을 입력한 경우 단을 잘못입력하였다는 메세지

실행
단=6
6*2=12
6*2=18
:
:
6*9=54





*/