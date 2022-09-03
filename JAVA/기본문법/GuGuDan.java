

public class GuGuDan {

	public static void main(String[] args) {
		System.out.println("\t구구단");
		for(int i=1; i<10; i+=3) {// i=1, 4, 7
			//단제목
			for(int j=i; j<i+3; j++) {// i=1 ->1,2,3 i=4->4,5,6 i=7-> 7,8,9
				System.out.print("="+j+"단=\t");	
			}
			System.out.println();
			//구구단
			for(int x=2; x<=9; x++) {
				for(int y=i; y<i+3; y++) {
					System.out.print(y+"*"+x+"="+(y*x)+"\t");
				}
				System.out.println();
			}
		}
	
		
		
		
		
		
		
		/*	System.out.println("        구구단");
		
		System.out.println("==1단== ==2단== ==3단==");
		 
		for(int i=1; i<=9; i=i+3) {
			for(int j=2; j<=9; j++ ) {
				
			for(int s=i; s<i+3; s++) {
				
			}
			System.out.print(s+ "x"+ j + "="+ j*s + "\t" );
			}

				
			}
		 System.out.println("==4단== ==5단== ==6단==");
*/
	}

}
