import java.util.Scanner;

public class feature2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int num : arr) {
            if (num > 50) {
                count++;
            }
        }

        System.out.println("Count of numbers greater than 50: " + count);
    }
}