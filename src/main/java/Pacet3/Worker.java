package Pacet3;

public abstract class  Worker {
    private String fio;



    Worker(String fio){
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public  abstract void print ();
}
