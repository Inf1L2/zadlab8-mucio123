package javaapplication18;
public class koło extends FPl{
    private double r;
    public koło(double r) 
    {
        this.r = r;
    }
    public double getR() 
    {
        return r;
    }
    public void setR(double r) 
    {
        this.r = r;
}
    public double obliczObwod() 
    {
        return 2*Math.PI*r;
    }
    
    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }
public String toString() {
        return "Koło=========> " + "Promień" + this.r + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
}
    
}
