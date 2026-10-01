package homework;

public class Sort {
    public static void main(String[] args) {

        int[] array = {1, 44, 8, 20, 11, 6, 6};



        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

//        int[] array = {4,7,1,3,9,0,2,15,25};
//        int max= array[0];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " | ");
//        }
//
//        System.out.println();
//
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] > max) {
//                max=array[i];
//            }
//        }
//        System.out.println("max=" + max);
//
//        int min= array[0];
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] < min) {
//                min=array[i];
//            }
//        }
//        System.out.println("min=" + min);
//
        System.out.println();
        System.out.println("ex1");
        int x = 44;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result = true;
            }
        }
        System.out.println(result);

        System.out.println("ex2");
        int index = -1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }
        System.out.println(index);


        index = 8;
        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Please input another index");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " krknvum e");
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
