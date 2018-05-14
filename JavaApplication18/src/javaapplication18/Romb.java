package javaapplication18;
public class Romb extends FPl{
    private double x,z;  

    public Romb(double x, double z) {
        this.x = x;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    
    public double obliczObwod() {
        return 4*x;
    }    
    public double obliczPole() {
        return x*z;
    }
    public String toString() {
    return "Romb========> " + "Bok pierwszy" + this.x + ", Wys" + this.z + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
}}