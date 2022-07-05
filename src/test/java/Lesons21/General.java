package Lesons21;


public class General {
    public static void main(String[] args) {
        Max<Integer>max = new Max<>();
        max.sum(1,5,7);


    }
}
class Max<T>{
    public <T> void sum(T a, T b, T c){
        System.out.println(Math.max(Math.max((Integer) a,(Integer)b), Math.max((Integer) b,(Integer)c)));
    }
}
