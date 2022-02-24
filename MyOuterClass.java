/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2022-02-23
 * Time: 1:26 p.m.
 * Description:
 */

class OuterClass {
    public int data1 = 9999;
    private int data2 = 2;
    public static int data3 = 3;

    class InnerClass {
        public int data1 = 1;
        public int data4 = 4;
        private int data5 = 5;
        public static final int data6 = 6;

        public InnerClass () {
            System.out.println("Constructor without parameter");
        }

        public void func(){
            System.out.println(OuterClass.this.data1);
            System.out.println(this.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println("InnerClass func");
        }

    }

    public void func(){
        System.out.println("Outclass func");
    }


}

public class MyOuterClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        //outerClass.func();


        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();


    }
}
