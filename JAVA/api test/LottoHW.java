package basic02_api;

import java.util.Scanner;

public class LottoHW {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.print("게임수=");
		int lotto = scan.nextInt();
		int[] arr = new int	[7];
		
		while(lotto>0) {
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*45)+ 1;
				for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
						i--;
					}
				}
						
			}
			System.out.print( lotto +"게임=[");
			for(int i=0; i<arr.length-1; i++) {
				
				System.out.printf("%5d,", arr[i]);
			}
			System.out.printf("], bonus=%5d",arr[6]);
			System.out.println();
			lotto--;
		}
		
		System.out.println("계속하시겠습니까(1:예, 2: 아니오)?");
		
		if(!scan.nextLine().equalsIgnoreCase("2")) {
			break;
		}
		
	}while(true);
		}	
			
	
	}


