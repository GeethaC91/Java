public class PersonObject {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Before change address"+" "+p.getAddress());
        p.changeAddress("USA");
        System.out.println("Changed Address"+" "+p.getAddress());
    }
}
