package Newlessons;

public enum TipeCuz {
    SEDAN("SEDAN"),
    UNIVERSAL("UNIVERSAL"),
    XECHBEK("XECHBEK");

    final String kuzovi;

    TipeCuz(String kuzovi){
        this.kuzovi = kuzovi;
    }
    public String getKuzovi() {
        return kuzovi;
    }

}
