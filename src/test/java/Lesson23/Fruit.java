package Lesson23;

public class Fruit {
    private TypeFruit typeFruit;
    private double weight;
    private double cast;

    public Fruit(TypeFruit typeFruit, double weight, double cast) {
        this.typeFruit = typeFruit;
        this.weight = weight;
        this.cast = cast;
    }

    public TypeFruit getTypeFruit() {
        return typeFruit;
    }

    public void setTypeFruit(TypeFruit typeFruit) {
        this.typeFruit = typeFruit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCast() {
        return cast;
    }

    public void setCast(double cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "typeFruit=" + typeFruit +
                ", weight=" + weight +
                ", cast=" + cast +
                '}';
    }
}
