
import java.util.*;

public class Treemap {
    public static void main(String[] args) {
         TreeMap<Integer,String> rollmap = new TreeMap<>(Collections.reverseOrder());
        rollmap.put(101,"darshan");
        rollmap.put(103,"jeevan");
        rollmap.put(102,"hemanth");
        System.out.println(rollmap);
    }
}
