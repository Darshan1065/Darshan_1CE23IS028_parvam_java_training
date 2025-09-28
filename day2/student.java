public class student {
    public String sName;
    public int sMarks;
    public student()
    {
        this("Darshan");
    }
    public student(String name)
    {
        this(name,70);
    }
    public student(String name,int marks)
    {
        this.sName=name;
        this.sMarks=marks;
    }
    void disp()
    {
        System.out.println("student name:"+sName);
        System.out.println("student marks:"+sMarks);
    }
    public static void main(String[] args) {
        student s=new student();
        s.disp();
    }
}
