import java.util.List;

public class VolumeCalculator implements IVolumeCalculator {
    @Override
    public int sum(List<ThreeDimensionalShape> shapes){
        int sum=0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).volume();
        }
        return sum;
    }
}
