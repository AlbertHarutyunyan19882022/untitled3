package Newlessons;

public enum MogelCar {
    BMW("BMW"),
    AUDI("AUDI"),
    VW("VW"),
    KIA("KIA"),
    LADA("LADA"),
    VOLVO("VOLVO");

   final String model;

    MogelCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
