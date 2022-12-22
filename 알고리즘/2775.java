import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //아파트 배열
        int[][] APT = new int[15][15];

        for(int i=0; i<15; i++) {
            
            APT[i][1] =1;
            APT[0][i]=i;

        }
        for(int i=1; i<15; i++) { //층
            for(int j=2; j<15; j++) { //호
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
        int T = in.nextInt();

        for(int i=0; i<T; i++) {
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(APT[k][n]);
        }

    }
}