package Lesson23;

public enum TypeFruit {
    APPLE("Яблоко"),
    ORANGE("Апельсин"),
    BANNAN("Банан");

   final private String type;

    TypeFruit(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
