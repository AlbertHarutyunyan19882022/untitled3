package Newlessons;

public class Car {
   private MogelCar mogelCar;
   private double v;
   private TipeCuz tipeCuz;


   public Car(MogelCar mogelCar, double v, TipeCuz tipeCuz) {
      this.mogelCar = mogelCar;
      this.v = v;
      this.tipeCuz = tipeCuz;

   }

   public Car(MogelCar mogelCar, double v, TipeCuz tipeCuz, int countC) {
      this.mogelCar = mogelCar;
      this.v = v;
      this.tipeCuz = tipeCuz;
      new Motor(countC);
   }
   public MogelCar getMogelCar() {
      return mogelCar;
   }

   public double getV() {
      return v;
   }

   public TipeCuz getTipeCuz() {
      return tipeCuz;
   }
   public class Motor{
      private int countC;

      public Motor(int countC) {
         this.countC = countC;
      }

      public int getCountC() {
         return countC;
      }
      public void aboutMotor(){
         System.out.println("Кол целиндров " + this.countC);
         System.out.println("объем Двиг " +  Car.this.getV());
      }
   }
}
