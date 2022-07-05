package Lesson4;

public interface Mail  {
  default   void sendMasseng(){
      System.out.println("отправка смс По почте");
  }
    void getMassages();
}
