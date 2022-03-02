
import java.util.Arrays;

public class FamilyOb {
    public static void main(String[] args) {
        Family f=new Family();
        f.displayNames();
        int savings= f.getSavings();
        f.checkSavings(savings);
    }
}
class Family
{
    String fathername;
    String mothername;
    String sonname;
    String daughtername;
    int fsalary;
    int msalary;
    int sfee;
    int dfee;
    int grocery=500;
    public Family()
    {
        fathername="Mahesh";
        mothername="namrata";
        sonname="gautham";
        daughtername="sitara";
        fsalary=90000;
        msalary=100000;
        sfee=1000;
        dfee=3000;
    }
    public void displayNames() {
            String s[]={fathername,mothername,sonname,daughtername};
        System.out.println(Arrays.toString(s));
    }
    public int getTotalSalary()
    {
        return fsalary+msalary;
    }
    public int getTotalFee()
    {
        return sfee+dfee;
    }
    public int getSavings()
    {
        return getTotalSalary()-(getTotalFee()+grocery);
    }
    public void checkSavings(int savings)
    {
        if(savings>1000)
            System.out.println("Congrats!!"+fathername+" "+"you saved"+" "+savings);
        else
            System.out.println(fathername+" "+"please try to save more");
    }
    }