public class Cube implements Shape,ThreeDimensionalShape {
    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double volume() {
        return Math.pow(getLength(), 3);
    }

    @Override
    public double area() {
        return 0;
    }
}
