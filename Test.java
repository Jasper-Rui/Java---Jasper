import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-18
 * Time: 8:43 p.m.
 * Description:
 */
class myArray1 {
    public Object[] objects = new Object[10];

    public void set(int pos, Object val) {
        this.objects[pos] = val;
    }

    public Object get(int pos) {
        return this.objects[pos];
    }
}


class myArray <T> {
    //public T[] objects = new T[10]; //error

    public T[] objects =(T[]) new Object[10];

    public void set(int pos, T val) {
        this.objects[pos] = val;
    }

    public T get(int pos) {
        return this.objects[pos];
    }
}

class Alg <T extends Comparable<T>> {
    public T find_Max (T[] array) {
        T max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0) max = array[i];
        }
        return max;
    }
}

class Alg1 {
    public static<T extends Comparable<T>> T find_Max (T[] array) {
        T max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0) max = array[i];
        }
        return max;
    }
}

class A {

}
class Person1 extends A{

}
class Student extends Person1 {

}
class C extends Student {

}

public class Test {
    public static void main(String[] args) {
        ArrayList<? super Person1> arrayList1 = new ArrayList<Person1>();

        //ArrayList<? super Person> arrayList2 = new ArrayList<Student>();
        arrayList1.add(new Person1());
        //arrayList1.add(new A());
        arrayList1.add(new Student());
        arrayList1.add(new C());

        ArrayList<? super Person1> arrayList2 = new ArrayList<A>();
        arrayList2.add(new Person1());
        arrayList2.add(new Student());

        //Person person = arrayList2.get(0);//why????
    }

    public static void main6(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        List<? extends Number> list1 = arrayList1;
        List<? extends Number> list2 = arrayList2;
    }

    public static void main5(String[] args) {

        Alg<Integer> alg = new Alg<>();
        Integer[] integers = new Integer[] {1,2,3,4};

        System.out.println(alg.find_Max(integers));
        //or
        System.out.println(Alg1.find_Max(integers));
        //or
        System.out.println(Alg1.<Integer>find_Max(integers));

        Alg<String> alg1 = new Alg<>();
        String[] strings = {"abc", "bac", "Jasper"};
        System.out.println(alg1.find_Max(strings));
    }

    public static void main1(String[] args) {
        myArray1 myArray1 = new myArray1();
        myArray1.set(0, "Jasper");
        myArray1.set(1, 1);
        String result = (String) myArray1.get(0);

        myArray<String> myArray = new myArray<>();
        myArray.set(0, "jasper");

        myArray<Integer> myArray2 = new myArray<>();
        //myArray<int> myArray1 = new myArray<int>(); //error, primitive data type can not be used inside <>
    }
}
