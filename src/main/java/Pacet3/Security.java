package Pacet3;

public class Security extends  Worker{
    Security(String fio) {
        super(fio);
    }

    @Override
    public void print(){
        System.out.println("Я охрана ");
    }
}
