public class nokia extends mobile {
    @Override
    void run(){
        System.out.println("nokia is derived class");
    }
    public static void main(String[] args){
       mobile obj=new nokia();
       obj.run();
       obj.dialnumber();
    }
}
