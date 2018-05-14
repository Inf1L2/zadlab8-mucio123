package javaapplication18;

public class Prostopadłościan extends FP {
    private double a,b,c;  

    public Prostopadłościan(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    
    public double obliczObjetosc() {
        return a * b * c;
    }
    
    public double obliczPole() {
        return 2 * (a * b + a * c + b * c);
}
    public String toString() {
    return "Prostopadłościan ====> " + "Bok pierwszy" + this.a + ", Bok drugi" + this.b + ", Bok trzeci" + this.c + ", Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}
}