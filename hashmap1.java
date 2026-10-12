import java.util.Scanner;
import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(101,"arun");
        students.put(102,"bala");
        students.put(103,"kumar");
        System.out.println(students.get(102));
        students.put(102,"bharath");
        System.out.println(students.get(102));
        students.remove(103);
        System.out.println(students.containsKey(101));
        System.out.println(students.containsValue("arun"));
        System.out.println(students.size());
        System.out.println(students.get(105));
        System.out.println(students.getOrDefault(105,"not found"));
    }
}