import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-24
 * Time: 8:55 a.m.
 * Description:
 */
class Person {
    public String ID;

    public Person(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}


public class HashBuck2 {

    public static void main(String[] args) {
        Person person1 = new Person("123");
        Person person2 = new Person("123");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person2.hashCode());
    }
}
