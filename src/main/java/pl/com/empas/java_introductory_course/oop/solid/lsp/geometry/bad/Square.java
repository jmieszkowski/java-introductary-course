package pl.com.empas.java_introductory_course.oop.solid.lsp.geometry.bad;

public class Square extends Rectangle {
    public Square(int length) {
        super(length, length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
