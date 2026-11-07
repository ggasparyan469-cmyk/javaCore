package dynamicarray;

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
        System.out.println();
        System.out.println("***2***");
        DynamicArray da1 = new DynamicArray();
        for (int i = 0; i < 16; i++) {
            da1.add(i);
        }
        da1.print();
        System.out.println();
        System.out.println("***3***");
        DynamicArray da3 = new DynamicArray();
        for (int i = 0; i < 22; i++) {
            da3.add(i);
        }
        da3.print();
        System.out.println();
        System.out.println("***4***");
        DynamicArray da4 = new DynamicArray();
        da4.add(5);
        da4.add(10);
        da4.add(15);
        da4.add(21);
        da4.add(12);
        System.out.print(da4.getByIndex(0) + " ");
        System.out.print(da4.getByIndex(2) + " ");
        System.out.print(da4.getByIndex(1) + " ");
        System.out.print(da4.getByIndex(6) + " ");

    }
}
