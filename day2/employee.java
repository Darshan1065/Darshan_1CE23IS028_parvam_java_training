public class employee {
    private String name;
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        employee e=new employee();
        e.setname("Darshan");
        System.out.println(e.getName());
    }
}
