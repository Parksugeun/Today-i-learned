import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int[] array = new int[N];

        for(int i = 0; i<N; i++) {
            array[i] = scan.nextInt();
        }
        
        scan.close();

        for(int i = 0; i < array.length; i++) {
            if(array[i] < X){
                System.out.print(array[i] + " ");
            }
        }

    }    
}