public class Cuboid implements Shape, ThreeDimensionalShape {
    private final int length;
    private final int width;
    private final int height;

    public Cuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return getLength() * getWidth() * getHeight();
    }
}
