package Praktic;

public class Gruupa extends Student {
    private int number;

    public Gruupa(int number, String name, int age) {
        super(name,age);
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void Privet(){
        System.out.println("Меня зовут" + this.getName() + "\nМне " + this.getAge()
        + " лет " +  " Я  учусь " + this.getNumber());
    }
}





