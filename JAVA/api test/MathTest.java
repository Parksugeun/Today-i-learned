package basic02_api;

public class MathTest {

	public static void main(String[] args) {

		System.out.println("abs->"+ Math.abs(9.36));

		//ceil : 올림
		System.out.println("ceil->"+ Math.ceil(125.3));
		//floor : 버림
		System.out.println("floor->"+ Math.floor(147.9));
		//round : 반올림
		System.out.println("round->"+ Math.round(1253.6));
	
		int first = 300;
		int second = 200;
		
		if(first > second) {//first
			System.out.println(first);
		}else {//second
			System.out.println(second);
					
		}
		
		System.out.println("max->"+Math.max(first, second));
		System.out.println("min->"+ Math.min(first, second));
		
		System.out.println("pow->"+ (int)Math.pow(5,3));
		
		System.out.println("sqrt->"+ Math.sqrt(10));
		
		System.out.println("random->" + (int)(Math.random()*10));
		}
		
		
	}


