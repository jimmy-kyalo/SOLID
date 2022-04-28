import java.util.List;

public class ThreeDimensionalShapesPrinter {
    private final IVolumeCalculator volumeCalculator;

    public ThreeDimensionalShapesPrinter(IVolumeCalculator volumeCalculator) {
        this.volumeCalculator = volumeCalculator;
    }

    public String jsonVolume(List<ThreeDimensionalShape> shapes) {
        return "{shapesSum3d: %s}".formatted(volumeCalculator.sum(shapes));
    }

    public String csvVolume(List<ThreeDimensionalShape> shapes) {
        return "shapes3d_sum, %s".formatted(volumeCalculator.sum(shapes));
    }
}
