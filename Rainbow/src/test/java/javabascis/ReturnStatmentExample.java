package javabascis;

public class ReturnStatmentExample extends MethodOverLaodingExample {

    int a = 100;

    final double pie = 3.14;

    public static void main(String[] args) {

        ReturnStatmentExample s = new ReturnStatmentExample();
        s.m1();
    }

    public int m1(){
        int a = 1;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        return a;
    }

    public String m2(){
        String b = "abc";
        return b;
    }
}
