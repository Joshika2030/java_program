import java.util.HashMap;
import java.util.Scanner;

public class hashmap4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        int maxElement = 0;
        int maxCount = 0;

        for (int num : map.keySet()) {
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxElement = num;
            }
        }

        System.out.println(maxElement + " occurs "
                           + maxCount + " times");

    }
}