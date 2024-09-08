package javabascis;

public class ConstructorExample {

    static int a ;
    public ConstructorExample(){

        a = 56;
    }


    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample();
        System.out.println(a);
    }
}
