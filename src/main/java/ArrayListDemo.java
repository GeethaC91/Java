import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("White");
        list.add("Black");
        list.add("maroon");
        //list.add(123);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println("size of list"+" "+list.size());
        //print the list
        System.out.println(list);
        //Using iterator to iterate through all elements in the array list
        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //Using for loop to print all elements of list
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //Using for-each loop
        //for(String s : list)
        //{
         //   System.out.println(s);
        //}
        //Adding element in first position
        list.add(0,"Purple");
        System.out.println(list);
        //Retrieve element from given position
        System.out.println(list.get(2));
        //Update specific array element at a given index
        list.set(2,"Black");
        System.out.println(list);
        //Remove an element at given index
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains("Blue"));
        //Collections.sort(list);
        System.out.println((list));
        Collections.swap(list,1,2);
        System.out.println(list);
    }
}
