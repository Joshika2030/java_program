import java.util.Scanner;
import java.util.ArrayList;
public class arrlist{
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(85);
        System.out.println(marks);
        marks.set(1,88);
        System.out.println(marks);
        marks.remove(0);
        System.out.println(marks);
        System.out.println(marks.get(0));
        System.out.println(marks.size());
        System.out.println(marks.contains(90));
        System.out.println(marks.isEmpty());
        marks.clear();
        System.out.println(marks.isEmpty());
    }
}