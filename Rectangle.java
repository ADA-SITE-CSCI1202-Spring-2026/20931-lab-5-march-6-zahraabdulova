public class Rectangle {

    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        return this.width == rect.width && this.height == rect.height;
    }
}
