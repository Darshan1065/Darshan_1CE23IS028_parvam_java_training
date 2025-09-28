
public class employees {
    int id;
    int salary;
    static String Company="STR Traders";
    employees(int i,int a)
    {
        id=i;
        salary=a;
    }
    void display(){
        System.out.print(id+""+salary+""+Company);
    }
public static void main(String[] args){
    employees e1=new employees(25,25000);
    employees e2=new employees(30,30000);
    e1.display();
    e2.display();
}
}
