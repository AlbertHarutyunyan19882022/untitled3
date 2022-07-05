package Praktic2;

public class Man extends  People{
   private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Man(double power, int speed) {
        super(power);
        this.speed = speed;

    }
    public void run(double time){
        System.out.println(time * speed);
    }
}
