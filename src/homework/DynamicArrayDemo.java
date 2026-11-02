package homework;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        System.out.println("***1***");
        da.add(5);
        da.add(10);
        da.add(15);
        da.add(21);
        da.add(12);
        da.print();
        System.out.println("***2***");
        DynamicArray da1 = new DynamicArray();

        da1.add(5);
        da1.add(10);
        da1.add(15);
        da1.add(21);
        da1.add(12);
        da1.add(8);
        da1.add(17);
        da1.add(3);
        da1.add(25);
        da1.add(14);
        da1.add(6);
        da1.add(19);
        da1.add(11);
        da1.add(22);
        da1.add(7);
        da1.print();
        System.out.println("***3***");
        DynamicArray da3 = new DynamicArray();
        da3.add(5);
        da3.add(10);
        da3.add(15);
        da3.add(21);
        da3.add(12);
        da3.add(8);
        da3.add(17);
        da3.add(3);
        da3.add(25);
        da3.add(14);
        da3.add(6);
        da3.add(19);
        da3.add(11);
        da3.add(22);
        da3.add(7);
        da3.add(30);
        da3.add(4);
        da3.add(16);
        da3.add(9);
        da3.add(28);
        da3.add(13);
        da3.add(24);
        da3.add(2);
        da3.add(18);
        da3.add(20);

        da3.print();
        System.out.println("***4***");
        DynamicArray da4 = new DynamicArray();
        da4.add(5);
        da4.add(10);
        da4.add(15);
        da4.add(21);
        da4.add(12);
        System.out.println(da4.getByIndex(0));
        System.out.println(da4.getByIndex(2));
        System.out.println(da4.getByIndex(1));
        System.out.println(da4.getByIndex(6));

    }
}
