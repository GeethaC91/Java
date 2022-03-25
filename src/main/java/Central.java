interface A
{
     void aaa();
     int x = 10;
}
interface B
{
     int x= 100;
     int aab();
}

class Central implements A,B
{

    public void aaa() // error
    {
        System.out.println("Helo");
    }
    public int aab()
    {
        System.out.println("Hello");
        return 1;
    }
    public static void main(String args[])
    {
      B c = new Central();
      c.aab();
        System.out.println(A.x);



    }
}


