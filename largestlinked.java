import java.util.LinkedList;
import java.util.Scanner;

public class largestlinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int largest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        System.out.println("Largest element: " + largest);

    }
}
