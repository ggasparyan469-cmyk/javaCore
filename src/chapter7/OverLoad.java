package chapter7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("resultat vizova ob.test(123.25) : " + result);
    }

    public static class CallByValue {
        public static void main(String[] args) {
            Test ob1 = new Test(2);
            Test ob2;
            ob2=ob1.incrByTen();
            System.out.println("ob1.a: " +ob1.a);
            System.out.println("ob2.a: " +ob2.a);
            ob2=ob2.incrByTen();
            System.out.println("оb2.а после второго увеличения значения:" + ob2.a);
        }
    }
}
