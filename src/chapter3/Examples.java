package chapter3;

public class Examples {
    public static void main(String[] args) {

///LONG
//        int lightspeed;
//        long days;
//        long seconds;
//        long distance;
//        lightspeed = 18600;
//        days = 1000;
//        seconds = days * 24 * 60 *60;
//        distance = lightspeed * seconds;
//        System.out.print("3a "+days);
//        System.out.print(" days  light will travel about ");
//        System.out.println(distance + "miles");
///DOUBLE
//        double pi, r, a;
//        r = 10.8;
//        pi=3.1416;
//        a=r*pi*r;
//        System.out.println("a="+a);
//
///CHAR
//        char ch1, ch2;
//        ch1=88;
//        ch2='Y';
//
//        System.out.print("ch1 and ch2: ");
//        System.out.println(ch1 + " " + ch2);

//        char ch1;
//        ch1 = 'X';
//        System.out.println("ch1 contains " + ch1);
//        ch1++;
//        System.out.println("ch1 now contains " + ch1);
///BOOLEAN
//            boolean b = false;
//            System.out.println("b = "+ b);
//            b=true;
//            System.out.println("b = " + b);
//            if(b) System.out.println("This code is executing.");
//            b=false;
//            if(b) System.out.println("This code is executing.");
//            System.out.println("10>9 = " + (10>9));
//        boolean a = true;
//        char c = '%';
//        System.out.println(a);
//        System.out.println("1"+c);
///INT
//        int x;
//        x=10;
//        if(x==10){
//            int y = 20;
//            System.out.println("x and y: " + x + " " +y);
//            x=y*2;
//            System.out.println("x = " + x);
//        }

//        int x;
//        for(x=0;x<3;x++){
//            int y= -1;
//            System.out.println("y=: " + y);
//            y=100;
//            System.out.println("y now =: " + y);
//        }

//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = .1234;
//        double result = (f * b) + (i / c) - (d * s);
//        System.out.println((f * b) + " + " + (i / c) + "-" + (d * s));
//        System.out.println("result = " + result);

//        int MonthDays[];
//        MonthDays = new int[12];
//        MonthDays[0] = 31;
//        MonthDays[1] = 28;
//        MonthDays[2] = 31;
//        MonthDays[3] = 30;
//        MonthDays[4] = 31;
//        MonthDays[5] = 30;
//        MonthDays[6] = 31;
//        MonthDays[7] = 31;
//        MonthDays[8] = 30;
//        MonthDays[9] = 31;
//        MonthDays[10] = 30;
//        MonthDays[11] = 31;
//
//        System.out.println("in april " + MonthDays[3] + " days.");


//        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
//        double result = 0;
//
//        for (int i = 0; i < 5; i++) {
//            result = result + nums[i];
//        }
//
//        System.out.println("The average value is = " + result / 5);
//
//        int twoD[][] = new int[4][5];
//        int k = 0;
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                twoD[i][j] = k;
//                k++;
//            }
//        }
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(twoD[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println("Example 1");
        System.out.println("Integer arithmetic");
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

        System.out.println("\nFloating-point arithmetic");
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

        System.out.println();
        System.out.println("Example2");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        System.out.println();
        System.out.println("example 3");
        int a1 = 1;
        int b1 = 2;
        int c1 = 3;
        a1 += 5;
        b1 *= 2;
        c1 = 3;

        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);

        System.out.println();
        System.out.println("example 4");
        int a2 = 1;
        int b2 = 2;
        int c2;
        int d2;
        c2 = ++b2;
        d2 = a2++;
        c2++;
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        System.out.println("c2 = " + c2);
        System.out.println("d2 = " + d2);

        System.out.println();
        System.out.println("example 5");

        String binary[] = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };

        int a3 = 3;
        int b3 = 6;

        int c3 = a3 | b3;
        int d3 = a3 & b3;
        int e3 = a3 ^ b3;
        int f2 = (~a3 & b3) | (a3 & ~b3);
        int g = ~a3 & 0x0f;

        System.out.println("a3 = " + binary[a3]);
        System.out.println("b3 = " + binary[b3]);
        System.out.println("a|b = " + binary[c3]);
        System.out.println("a&b = " + binary[d3]);
        System.out.println("a^b = " + binary[e3]);
        System.out.println("~a3&b3 | a3&~b3 = " + binary[f2]);
        System.out.println("~a3 = " + binary[g]);

        System.out.println();
        System.out.println("example 6 ");
        byte a4 = 64, b4;
        int h;
        h = a4 << 2;
        b4 = (byte) (a << 2);
        System.out.println("a4:" + a4);
        System.out.println("h and b4: " + h + " " + b4);

        System.out.println();
        System.out.println("example 7");
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b5 = (byte) 0xf1;
        System.out.println("b5 = 0x" + hex[(b5 >> 4) & 0x0f]
                + hex[b5 & 0x0f]);

        System.out.println();
        System.out.println("example 8");
        char hex1[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        byte b6 = (byte) 0xf1;
        byte c6 = (byte) (b6 >> 4);
        byte d6 = (byte) (b6 >>> 4);
        byte e6 = (byte) ((b6 & 0xff) >> 4);
        System.out.println("b6 = 0x" + hex1[(b6 >> 4) & 0x0f] + hex1[b6 & 0x0f]);
        System.out.println("b6 >> 4 = 0x" + hex1[(c6 >> 4) & 0x0f] + hex1[c6 & 0x0f]);
        System.out.println("b6 >>> 4 = 0x" + hex1[(d6 >> 4) & 0x0f] + hex1[d6 & 0x0f]);
        System.out.println("(b6 & 0xff) >> 4 = 0x" + hex1[(e6 >> 4) & 0x0f] + hex1[e6 & 0x0f]);

        System.out.println();
        System.out.println("example 9");
        int j = 1;
        int k = 2;
        int r = 3;
        j |= 4;
        k >>= 1;
        r <<= 1;
        j ^= r;
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("r = " +r);

        System.out.println();
        System.out.println("example 10");
        boolean a7=true;
        boolean b7=false;
        boolean c7=a7|b7;
        boolean d7=a7&b7;
        boolean e7=a7^b7;
        boolean f7=(!a7&b7) | (a7 & b7);
        boolean g7=!a7;
        System.out.println("a=" + a7);
        System.out.println("b=" + b7);
        System.out.println("a|b=" + c7);
        System.out.println("a&b=" + d7);
        System.out.println("a^b=" + e7);
        System.out.println("!a&b | a&!b = " + f7);
        System.out.println("!a = " + g7);
        System.out.println();

        System.out.println();
        System.out.println("example 11");




    }
}