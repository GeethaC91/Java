   public class Person {
    String firstname;
    String lastname;
    private String address;
    int age;
    public String getFullName()
    {
        return firstname+" "+lastname;
    }
    public Person(String fname,String lname,String address,int age)
    {
       firstname=fname;
       lastname=lname;
       this.address=address;
       this.age=age;
    }
    public void changeAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return address;
    }
}

