package samples;

import method.Rejection;
import java.io.IOException;
import java.util.function.Function;

/**
 *
 * @author tadaki
 */
public class SinSquare {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        double min = 0.;
        double max = Math.PI;
        int numBin = 100;
        int numSamples = 100000;
        double maxOfFunction = 2 / Math.PI;
        // 正弦関数の二乗に比例した確率密度関数
        // (2/pi)*sin(x)^2
        Function<Double, Double> probDensity = (x) -> {
            return (2 / Math.PI) * Math.sin(x) * Math.sin(x);
        };
        Rejection rejection = new Rejection(
                probDensity, min, max, maxOfFunction);
        GenerateSample sample = new GenerateSample(min, max, numBin, numSamples);
        //乱数生成
        sample.generate(rejection);
        //出力
        sample.outputHistogram("sinSquare.txt");
    }

}
