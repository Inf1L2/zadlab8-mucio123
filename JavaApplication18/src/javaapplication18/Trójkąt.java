package javaapplication18;
public class Trójkąt extends FPl{
    private double a,h;
    public Trójkąt(double a, double h) {
        this.a = a;
        this.h = h;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
        public double obliczObwod() {
        return 3*a;
    }    
    public double obliczPole() {
        return (a*h)/2;
    }
    public String toString() {
        return "Trójkąt========> " + "Bok pierwszy" + this.a + " Wys" + this.h + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
    }

}