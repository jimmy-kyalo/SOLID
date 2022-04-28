import java.util.List;

public class Main {
    public static void main(String[] args) {
        IVolumeCalculator volumeCalculator = new VolumeCalculator() ;
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(20, 10);
        Cube cube = new Cube(10);
        Cuboid cuboid = new Cuboid(20,10,10);
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        ThreeDimensionalShapesPrinter printer1 = new ThreeDimensionalShapesPrinter(volumeCalculator);
        List<Shape> shapes = List.of(circle, square, rectangle);
        List<ThreeDimensionalShape> shapes3d = List.of(cube,cuboid);
        System.out.println(printer.jsonArea(shapes));
        System.out.println(printer.csvArea(shapes));
        System.out.println();
        System.out.println(printer1.jsonVolume(shapes3d));
        System.out.println(printer1.csvVolume(shapes3d));
    }
}
