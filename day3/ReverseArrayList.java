import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

        System.out.println("Reversed List: " + list);
    }
}

