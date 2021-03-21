package pl.zzpj2021.solid.lsp.shape;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double oneSide, double secSide){
        this.a = oneSide;
        this.b = secSide;
    }
    @Override
    public double calculateArea() {
        return a*b;
    }
}
