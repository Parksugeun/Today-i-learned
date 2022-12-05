import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array;

        int testcase = scan.nextInt();

        for(int i=0; i<testcase; i++){
            int N = scan.nextInt();
            array = new int[N];

            double sum = 0;

            for(int j=0; j<N; j++){
                int val = scan.nextInt();
                array[j] = val;
                sum += val;
            }
            double mean = (sum /N);
            double count =0;

            for(int j=0; j<N; j++){
                if(array[j]>mean){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        scan.close();
    }    
}
