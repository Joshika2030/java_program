import java.util.*;

public class diagnal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += a[i][i];
        }

        for (int i = 0; i < rows; i++) {
            sum += a[i][cols - 1 - i];
        }
        sum -= a[rows / 2][cols / 2];

        System.out.println(sum);
    }
}