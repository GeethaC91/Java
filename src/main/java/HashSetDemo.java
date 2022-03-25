import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(null);
       // set.add("geetha");
        set.add(1);
        System.out.println(set.contains(100));
        System.out.println(set);
        for(Object i: set)
        {
            System.out.println(i);
        }
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
