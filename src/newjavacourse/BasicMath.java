package newjavacourse;

public class BasicMath {
    public static void main(String[] args) {
        System.out.println("Цeлoчиcлeннaя арифметика");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("Apифмeтикa с плавающей точкой");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;

        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }

    public static class BitLogic {
        public static void main(String[] args) {
            String binary[] = {
                    "0000", "0001", "0010", "0011",
                    "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011",
                    "1100", "1101", "1110", "1111"
            };
            int a = 3;
            int b = 6;
            int c = a | b;
            int d = a & b;
            int e = a ^ b;
            int f = (~a & b) | (a & ~b);
            int g = ~a & 0x0f;

            System.out.println("a = " + binary[a]);
            System.out.println("b = " + binary[b]);
            System.out.println("a|b= " + binary[c]);
            System.out.println("a&b = " + binary[d]);
            System.out.println("a^b = " + binary[e]);
            System.out.println("(~a & b) | (a & ~b) = " + binary[f]);
            System.out.println("~a " + binary[g]);
        }
    }
}
