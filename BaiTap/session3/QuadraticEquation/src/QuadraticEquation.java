public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return this.a;
    }

    public double getterB() {
        return this.b;
    }

    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        this.delta = this.b * this.b - 4 * this.a * this.c;

        return this.delta;
    }

    public double getRoot1() {

        return (-this.b + Math.sqrt(this.b * this.b - Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }

    public double getRoot2() {

        return (-this.b - Math.sqrt(this.b * this.b - Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }
}
