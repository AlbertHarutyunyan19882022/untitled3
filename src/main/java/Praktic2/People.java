package Praktic2;

public class People {
    private double power;

    public People(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public void work(double time){
        System.out.println(time * power);
    }
}
