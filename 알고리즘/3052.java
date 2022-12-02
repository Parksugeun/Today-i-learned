import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> A = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            A.add(scan.nextInt() % 42);
        }
        scan.close();
        System.out.print(A.size());
    }    
}
