package Lesonns20;


@FunctionalInterface
public interface WomenDress {
    void wear();


    default void hello(){
        System.out.println("Добро пожаловать в магазин!!!");
    }
   boolean equals(Object obj);

}
