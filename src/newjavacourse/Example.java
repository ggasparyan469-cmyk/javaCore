package newjavacourse;

public class Example {
    int a;
    Example(int i){
        a=i;
    }

    Example incrByTen(){
        Example temp = new Example(a+10);
        return temp;
    }
}
