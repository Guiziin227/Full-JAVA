package aula04_delimitados.model.entities;

public class Triangle implements Shape{
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double area() {
        return (base * height) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
