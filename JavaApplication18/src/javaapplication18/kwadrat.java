package javaapplication18;
public class kwadrat extends FPl {
    private double a;
    public kwadrat(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double obliczObwod() {
        return 4*a;
    }
    public double obliczPole() {
        return a*a;
}
    public String toString() {
    return "Kwadrat====> " + "Bok" + this.a + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
    }
}