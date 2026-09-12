import java.util.*;

public class identitymatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean identity = true;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(i == j && a[i][j] != 1) {
                    identity = false;
                }

                if(i != j && a[i][j] != 0) {
                    identity = false;
                }
            }
        }

        if(identity) {
            System.out.println("Identity Matrix");
        }
        else {
            System.out.println("Not Identity Matrix");
        }
    }
}