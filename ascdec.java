import java.util.Scanner;

public class ascdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }

            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("Sorted in ascending order");
        } else if (descending) {
            System.out.println("Sorted in descending order");
        } else {
            System.out.println("Not Sorted");
        }
    }
}