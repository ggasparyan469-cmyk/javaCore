package newjavacourse;

public class Overload {
    public static void main(String[] args) {
        OverloadDem ob = new OverloadDem();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);

        result = ob.test(123.25);

        System.out.println("Result: " + result);
    }
}
