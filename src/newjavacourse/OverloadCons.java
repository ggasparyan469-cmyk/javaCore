package newjavacourse;

public class OverloadCons {
    public static void main(String[] args) {
        Box1 mb1 = new Box1(10,20,15);
        Box1 mb2 = new Box1();
        Box1 mb3 = new Box1(7);

        double vol;

        vol=mb1.volume();
        System.out.println("V mb1 = "  + vol);

        vol=mb2.volume();
        System.out.println("V mb2 = "  + vol);

        vol=mb3.volume();
        System.out.println("V mb3 = "  + vol);
    }
}
