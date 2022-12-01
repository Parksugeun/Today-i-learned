import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[]array = new int[N];
        
        for(int i=0; i < N; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(array);
        System.out.print(array[0]+" "+array[N-1]);
    }    
}
