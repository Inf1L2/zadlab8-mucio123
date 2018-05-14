package javaapplication18;
public class Walec extends FP{
    private double r,h;
    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }    
    public double obliczObjetosc() {
        return Math.PI*Math.pow(r,2)*h;
    }    
    public double obliczPole() {
        return 2*Math.PI*r*(r+h);
    }
    public String toString() {
        return "Walec=========> " + "Promień" + this.r + ", Wys" + this.h + ", Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}

}