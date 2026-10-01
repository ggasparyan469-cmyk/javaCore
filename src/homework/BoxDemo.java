package homework;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("v =  " + vol);

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 14;
        mybox1.height = 36;
        mybox1.depth = 1;
        //
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("v =  " + vol);
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("v = " + vol);

        mybox1.volue();
        mybox2.volue();

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox1.volume();
        System.out.println("Ծավալը հավասար է " + vol);

        vol = mybox2.volume();
        System.out.println("Ծավալը հավասար է " + vol);

    }

}
