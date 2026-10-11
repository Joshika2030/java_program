import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> marks = new LinkedList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);

        System.out.println(marks.contains(20));

        System.out.println(marks.indexOf(30));

        marks.set(1, 15);

        System.out.println(marks.size());

        marks.clear();

        System.out.println(marks.size());

        System.out.println(marks.isEmpty());
    }
}
