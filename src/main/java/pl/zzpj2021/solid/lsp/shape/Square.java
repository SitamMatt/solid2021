package pl.zzpj2021.solid.lsp.shape;

public class Square extends Shape {
    private double a;

    public Square(int sideLength){
        this.a = sideLength;
    }
    @Override
    public double calculateArea() {
        return a*a;
    }
}
