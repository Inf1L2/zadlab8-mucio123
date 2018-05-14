package javaapplication18;
public class Prostokąt extends FPl{
    private double a,b; 
public Prostokąt(double a, double b) {
        this.a = a;
        this.b = b;
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
    public double obliczObwod() {
        return 2*a+2*b;
    }
    
    public double obliczPole() {
        return a*b;
}
    public String toString() {
   return "Prostokąt====> " + "Bok pierwszy" + this.a + ", Bok drugi" + this.b + ", Obwód" + obliczObwod() + " Pole" + obliczPole();
}
}