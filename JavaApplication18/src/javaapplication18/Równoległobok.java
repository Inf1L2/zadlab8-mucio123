
package javaapplication18;
public class Równoległobok extends FPl{
    private double x,y,z;
    public Równoległobok(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    
    public double obliczObwod() {
        return 2*x+2*y;
    }    
    public double obliczPole() {
        return x*z;
}
    public String toString() {
    return "Równoległobok======> " + "Bok pierwszy" + this.x + ", Bok drugi" + this.y + ", Wys" + this.z + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
}}