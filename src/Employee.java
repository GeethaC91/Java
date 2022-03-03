import java.util.Date;

public class Employee {
    String name;
    int emp_id;
    String dept;
    //Date hiredate;
    String hiredate;
    double hourlyrate;
    public String getEmpDetails()
    {
        String s1 = ("Employee Name="+name
                +"\t"+"Employee id="+emp_id
                +"\t"+"Department="+dept
                +"\t"+"Hire Date="+hiredate
                +"\t"+"Hourly Rate="+hourlyrate);
        return s1;
    }
}
