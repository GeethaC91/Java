public class EmpOb {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.emp_id=12345;
        e.name="Geetha";
        e.dept="IT";
        e.hiredate="13/03/2012";
        e.hourlyrate=60;
        System.out.println(e.getEmpDetails());
    }
}
