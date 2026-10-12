import java.util.HashMap;
import java.util.Scanner;

public class nonrepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

    }
}