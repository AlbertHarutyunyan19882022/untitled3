package Lessons19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People man1 = new People("Иван", 250);
        People man2 = new People("Гоша", 270);
        People man3 = new People("Вика", 190);

        People[] peoples = new People[]{man1, man2, man3};


        Arrays.sort(peoples);
        System.out.println(Arrays.deepToString(peoples));



    }
}
