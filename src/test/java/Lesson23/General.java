package Lesson23;

import java.util.Arrays;
import java.util.Comparator;

public class General {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit(TypeFruit.APPLE, 10, 5.5);
        Fruit fruit2 = new Fruit(TypeFruit.BANNAN, 3.4, 10.1);
        Fruit fruit3 = new Fruit(TypeFruit.ORANGE, 7.8, 15.5);

        Fruit[] fruits = new Fruit[]{fruit1, fruit2, fruit3};
        Comparator<Fruit> fruitComparator = (a, b) -> {
            new Double(a.getWeight()).compareTo(b.getWeight());
            return 0;
        };

        Arrays.sort(fruits, fruitComparator);

    }
}
