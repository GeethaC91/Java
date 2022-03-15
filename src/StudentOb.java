public class StudentOb {
    public static void main(String[] args) {
        Student s1=new Student("Geetha","A1209","IT");
        s1.greet();
        Student s2=new Student("Abhi","B234","CSE");
        s2.greet();
        s2.setStudent_name("Abhee");
        s2.greet();
    }
}
