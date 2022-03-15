public class Student {
    public static final String COLLEGE_NAME = "ABC";
    private String student_name;
    private String roll_no;
    private String course_id;
    public Student() {
    }
    public Student(String student_name, String roll_no) {
        this();
        this.student_name = student_name;
        this.roll_no = roll_no;
    }
    public Student(String student_name,String roll_no,String course_id) {
        this(student_name,roll_no);
        this.course_id = course_id;
    }
    public String getStudent_name()
    {
        return student_name;
    }
    public void setStudent_name(String student_name)
    {
        this.student_name=student_name;
    }
    public String getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getCourse_id() {
        return course_id;
    }
    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
    public void greet()
    {
        StringBuffer sb= new StringBuffer();
        sb.append("Hello!!"+student_name+"\n"
        +"Welcome to"+" "+COLLEGE_NAME+"\n"
        +"you enrolled in"+" "+course_id+"\n"
        +"your roll_number is"+" "+roll_no);
        System.out.println(sb);
    }
    public static void printCollegeName()
    {
        System.out.println(COLLEGE_NAME);
    }
}
