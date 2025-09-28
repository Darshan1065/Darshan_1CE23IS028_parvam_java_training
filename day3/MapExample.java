import java.util.HashMap;
 import java.util.Map;
 public class MapExample {
public static void main(String[] args) {
 Map<String,Integer> fp = new HashMap<>();
 fp.put("apple",80);
 fp.put("banana",50);
 fp.put("mango",60);
 for (Map.Entry<String,Integer> entry : fp.entrySet()) {
 System.out.println("name: " + entry.getKey() + ", price: " + entry.getValue());
 }
 }
 }

