public class CarSedan extends Car {
    private int truncV;
    private int countOfDoor;

 public CarSedan(int maxSpeed, int truncV, int countOfDoor){
     super(maxSpeed);
     this.truncV =truncV;
     this.countOfDoor = countOfDoor;
 }
    public int getTruncV() {
        return truncV;
    }

    public void setTruncV(int truncV) {
        this.truncV = truncV;
    }

    public int getCountOfDoor() {
        return countOfDoor;
    }

    public void setCountOfDoor(int countOfDoor) {
        this.countOfDoor = countOfDoor;
    }
    @Override
    public void gas() {
        System.out.println("Разагрев");
        System.out.println("Думаю ");
//        System.out.println("Еду");
        super.gas();
    }

    public boolean autoOpenTrunk(){
        return true;
    }
}
