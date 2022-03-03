import java.util.Date;

public class Employee {
    String name;
    int emp_id;
    String dept;
    Date hiredate;
    double hourlyrate;
    public void getEmpDetails()
    {
        StringBuffer sb=new StringBuffer();
        sb.append("Employee Name="+name
                +"\t"+"Employee id="+emp_id
                +"\t"+"Department="+dept
                +"\t"+"Hire Date="+hiredate
                +"\t"+"Hourly Rate="+hourlyrate);
        System.out.println(sb);
    }
}
