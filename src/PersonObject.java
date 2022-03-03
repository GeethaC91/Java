public class PersonObject {
    public static void main(String[] args) {
        Person p = new Person("Geetha","Bhupathi","Canada",16);
        System.out.println("Full name:"+p.getFullName());
        System.out.println("Before change address"+" "+p.getAddress());
        p.changeAddress("USA");
        System.out.println("Changed Address"+" "+p.getAddress());
    }
}
