package pl.com.empas.java_introductory_course.oop.solid.lsp.geometry.good;

public class Rectangle implements AreaCalculatorContract{
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public long calculateArea() {
        return this.height * this.width;
    }
}
