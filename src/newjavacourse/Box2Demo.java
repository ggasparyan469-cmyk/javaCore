package newjavacourse;

public class Box2Demo {
    public static void main(String[] args) {
        Box2 b2 = new Box2();
        b2.setDim(2, 3, 4);
        double volume = b2.volume();
        System.out.println("V = " + volume);
    }
}
