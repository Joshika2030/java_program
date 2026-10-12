import java.util.HashMap;
import java.util.Scanner;

public class hashmap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Enter numbers :");
        String input = sc.nextLine();

        String[] nums = input.split("\\s+");

        for (String num : nums) {
            int n = Integer.parseInt(num);

            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        System.out.println("Number occurrences:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}