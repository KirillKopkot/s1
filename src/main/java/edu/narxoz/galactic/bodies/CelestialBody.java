public abstract  class CelestialBody {
    private String name;
    private double x;
    private double y;

    protected CelestialBody(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    String getName() {
        return name;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    public double distanceTo(CelestialBody other) {
        if (other == null) {
            throw new IllegalArgumentException("Other celestial body cannot be null");
        }
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}