package newjavacourse;

public class RetOb {
    public static void main(String[] args) {
        Example ob1=new Example(2);
        Example ob2;

        ob2=ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();

        System.out.println(
                "ob2.a после второго увеличения значения: "
                        + ob2.a); System.out.println();
    }
}
