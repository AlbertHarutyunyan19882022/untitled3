package Lesonns20;

public class Dress implements WomenDress {
  @Override
    public void wear(){
      System.out.println("Платье оденим медленно ");
  }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

}

