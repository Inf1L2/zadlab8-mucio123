
package javaapplication18;
public class Sześcian extends FP {
    private double a;
    public Sześcian(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }    
    public double obliczObjetosc() {
        return Math.pow(a, 3);
    }    
    public double obliczPole() {
        return 6 * Math.pow(a, 2);
    }
    public String toString() {
return "Sześcian======>" + "Bok" + this.a + "Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}
}