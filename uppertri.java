import java.util.Scanner;

public class uppertri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isUpper = true;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    isUpper = false;
                    break;
                }
            }
        }

        if (isUpper) {
            System.out.println("Upper triangular matrix");
        } else {
            System.out.println("Not an upper triangular matrix");
        }
    }
}