package Pacet3;

public final class President extends  Worker{
    President(String fio) {
        super(fio);
    }


    @Override
    public void print() {
        System.out.println("Я президент! Меня зовут" + this.getFio());
    }
}
