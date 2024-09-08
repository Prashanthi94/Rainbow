package javabascis;

public class MethodRidingExample extends ReturnStatmentExample{

    public static void main(String[] args) {

        ReturnStatmentExample r = new ReturnStatmentExample();
        r.m1();
    }

    public int m1(){

        int a = 78;
        System.out.println(a);
        return a;
    }
}
