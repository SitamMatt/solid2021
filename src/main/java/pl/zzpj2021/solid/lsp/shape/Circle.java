package pl.zzpj2021.solid.lsp.shape;

public class Circle extends Shape{

    private double r;

    @Override
    public double calculateArea() {
        return Math.PI *(r*r);
    }

}
