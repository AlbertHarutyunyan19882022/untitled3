public class Car {
    private int maxSpeed;  // 250 km
    private String model; //Opel 5

    public Car(int maxSpeed){
     this.maxSpeed = 100;
    }
//    public Car(){
//
//    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    protected void gas() {
        System.out.println("Еду");
    }

    public void stop() {
        System.out.println("stop");
    }
}
