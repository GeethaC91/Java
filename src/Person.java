   public class Person {
    String firstname;
    String lastname;
    private String address;
    int age;
    public String getFullName()
    {
        return firstname+lastname;
    }
    public Person()
    {
        this.firstname="Geetha";
        this.lastname="Bhupathi";
        this.address="Canada";
        this.age=16;
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

