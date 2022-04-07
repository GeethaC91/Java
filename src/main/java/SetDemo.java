import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person(10));
        set.add(new Person(11));
        set.add(new Person(10));
        System.out.println(set);

    }

     static class Person implements Comparable<Person> {
        private int age;

         public Person(int age) {
             this.age = age;
         }

         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             this.age = age;
         }

         @Override
         public String toString() {
             return "Person{" +
                     "age=" + age +
                     '}';
         }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Person person = (Person) o;
             return age == person.age;
         }

         @Override
         public int hashCode() {
           return Objects.hash(age);
         }

         @Override
         public int compareTo(Person o) {
             return 0;
         }
     }
}
