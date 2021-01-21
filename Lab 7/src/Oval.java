public class Oval extends Shape {

    private double horRadius;
    private double verRadius;

    public Oval(double horRadius, double verRadius) {
        this.setName("Oval");
        this.horRadius = horRadius;
        this.verRadius = verRadius;
    }

    public double getHorRadius() {
        return horRadius;
    }

    public double getVerRadius() {
        return verRadius;
    }

    @Override
    public double area() {
        return Math.PI * (verRadius * horRadius);
    }

}