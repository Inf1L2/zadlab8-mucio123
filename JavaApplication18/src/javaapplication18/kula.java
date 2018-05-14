package javaapplication18;
public class kula extends FP{
    private double r;
    public kula(double r) 
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
    public double obliczObjetosc() 
    {
        return (4*Math.PI*Math.pow(r,3))/3;
    }    
    public double obliczPole() 
    {
        return 4*Math.PI*Math.pow(r,2);
}
    public String toString() {
        return "Kula======> " + "Promień" + this.r + ", Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}
}