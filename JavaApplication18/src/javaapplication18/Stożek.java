
package javaapplication18;
public class Stożek extends FP{
    private double r,h,l;  
    public Stożek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
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
    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }    
    public double obliczObjetosc() {
        return (Math.PI*Math.pow(r,2)*h)/3;
    }    
    public double obliczPole() {
        return Math.PI*r*(r+l);
}
     public String toString() {
     return "Stożek======> " + "Promień" + this.r + ", Wys" + this.h + " Tworząca" + this.l + ", Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}
}