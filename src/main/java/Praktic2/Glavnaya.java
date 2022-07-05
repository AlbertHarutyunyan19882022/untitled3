package Praktic2;

public class Glavnaya {
    public static void main(String[] args) {


        People people =  new People(111);
        people.work(1);


        Man man = new Man(222, 12);
        man.run(2);
        man.work(123);

    }
}