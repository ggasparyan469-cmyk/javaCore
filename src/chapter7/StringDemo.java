package chapter7;

public class StringDemo {

    public static void main(String args[]) {
//            String ob1 = "first";
//            String ob2 = "second";
//            String ob3= ob1 + " and " + ob2;
//
//            System.out.println(ob1);
//            System.out.println(ob2);
//            System.out.println(ob3);
        String ob1 = "first";
        String ob2 = "second";
        String ob3 = ob1;

        System.out.println("strOb1 տողի երկարությունը՝ " + ob1.length());
        System.out.println("strOb1 տողի 3-րդ ինդեքսի սիմվոլը՝ "
                + ob1.charAt(3));
       if (ob1.equals(ob2)){
           System.out.println("ob1 == ob2");
       }else{
           System.out.println("ob1 != ob2");
       }

       if (ob1.equals(ob3)){
           System.out.println("ob1 == ob3");
       }else{
           System.out.println("ob1 != ob3");
       }
    }
}
