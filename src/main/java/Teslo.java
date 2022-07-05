public class Teslo extends Car {
    private int maxDistance;
    private double chargeV;
    private String site; // с какой стороны зарядка

    public Teslo(int maxSpeed) {
        super(maxSpeed);
    }


    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public double getChargeV(int i) {
        return chargeV;
    }

    public void setChargeV(double chargeV) {
        this.chargeV = chargeV;
    }

    public String getSite(String с_лево) {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    @Override
    protected void gas(){
        System.out.println("Быстро еду");
    }
}
