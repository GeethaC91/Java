public class EvenArray {
    public static void main(String[] args) {
        int a[]={3,2,8,1,4,7};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
              count++;
            }
        }
        System.out.println("NUmber of even numbers in the array"+" "+count);
    }
}
