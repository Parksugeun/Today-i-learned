import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] student = new int[31];

        for(int i=0; i<29; i++){
            int a = scan.nextInt();
            student[a]=1;
        }
        for(int i=0; i<student.length; i++){
            if(student[i] !=1){
                System.out.print(i);
            }
        }
        scan.close();

    }
    
}
