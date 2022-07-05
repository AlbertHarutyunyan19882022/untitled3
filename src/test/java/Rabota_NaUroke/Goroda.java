package Rabota_NaUroke;
// Порядок важен
public enum Goroda {
    MOGILEV("Могилев"),
    GOMEL("ГОМЕЛЬ"),
    BREST("БРЕСТН"),
    VITEBSK("ВИТЕБСК"),
    GRODNO("ГРОДНО"),
    MINSK("МИНСК");

     final private String goroda;

    Goroda(String goroda) {
        this.goroda = goroda;

    }

    public String getGoroda(){
        return goroda;
    }
}
