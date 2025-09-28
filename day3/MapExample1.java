import java.util.HashMap;
 import java.util.Map;
 public class MapExample1 {
public static void main(String[] args) {
 Map<Integer, String> student = new HashMap<>();
 student.put(101,"darshan");
 student.put(102, "hemanth");
student.put(103, "jeevan");

  int studentId = 101;
        String StudentName = student.get(studentId);
    if(StudentName!=null)
    {
        System.out.println("student with ID " +studentId+ ":"+StudentName);
    }
    else 
    {
         System.out.println("Student with ID " + studentId + " not found.");
    }
    
 }
 }

