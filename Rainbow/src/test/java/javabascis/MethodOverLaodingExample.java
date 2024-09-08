package javabascis;

public class MethodOverLaodingExample {


    int a = 500;

    public static void main(String[] args) {

        MethodOverLaodingExample m = new MethodOverLaodingExample();
        m.m1(23,78);
    }

    public void m1(int a){

        System.out.println(a);
    }

    public void m1(String a){

        System.out.println(a);
    }

    public void m1(int a , int b){

        System.out.println(a);
        System.out.println(b);
    }


    public void m1(String a , int b){

        System.out.println(a);
        System.out.println(b);
    }
}
