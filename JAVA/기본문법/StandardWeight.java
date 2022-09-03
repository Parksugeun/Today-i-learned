import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("나이=");
		int age = scan.nextInt();
		
		System.out.print("성별(1:남성, 2:여성)=");
		int sex = scan.nextInt();
		System.out.print("키=");
		int height = scan.nextInt();
		System.out.print("현재체중=");
		int weight = scan.nextInt();
		
		
		if(age>=35 && sex==1) {
			double avew = (height-100)*0.90;
		}
		if(age>=35 && sex==2) {
			double avew = (height-100)*0.85;
			}
		if(age<=36 && sex==1) {
			double avew = (height-100)*0.95;
		}
		if(age<=36 && sex==2) {
			double avew = (height-100)*0.90;
		}
		System.out.print("표준체중="+(double)avew);
		
		double avewIndex = (weight/(double)avew)*100;
		
				
		System.out.print("당신은 표준체중지수는"+ avewIdex +"으로"+ grade + "입니다");
		
		String grade;
		
		if(double avewIndex>=85) {
			grade = "마른형";	
		}
		if(86<=double avewIndex<=95) {
			grade = "조금마른형";
		}
		if(96<=double avewIndex<=115) {
			grade = "표준형";
		}
		if(116<=double avewIndex<=125) {
			grade = "조금 비만형";
		}
		if(126<=double avewIndex) {
			grade = "비만형";
		}
			
		
			
	}

}
