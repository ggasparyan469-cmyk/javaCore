package newjavacourse;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0x0FFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num<<1;
            System.out.println(num);
        }
    }
}
