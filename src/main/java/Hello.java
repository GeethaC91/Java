public class Hello {
    public static void main(String[] args) {
        calculate(1, 0);
    }
        public static void calculate(int i,int j)
        {
            try {
                System.out.println(i / j);
                //System.out.println("Hello");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.println("j cannot be 0");
            }
            finally
            {
                System.out.println("finally block");
            }
        }
    }
