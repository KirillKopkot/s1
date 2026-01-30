public abstract  class Cargo {
    private double weightKg;
    private String description;

    protected Cargo(double weightKg, String description) {
        this.weightKg = weightKg;
        this.description = description;
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDescription() {
        return description;
    }


}