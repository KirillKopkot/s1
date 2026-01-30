public class Planet extends CelestialBody {
    private String atmosphireType;

    public Planet(String name, double x, double y, String atmosphireType) {
        super(name, x, y);
        this.atmosphireType = atmosphireType;
    }

    public String getAtmosphireType() {
        return atmosphireType;
    }
}