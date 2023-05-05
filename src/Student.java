public class Student {
    private String name;
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Chamika");
        System.out.println(s.getname());
    }
}