package method;

import java.util.function.DoubleFunction;

/**
 * 変換法による乱数生成
 *
 * @author tadaki
 */
public class Transform implements RandomGenerator {

    //確率分布の逆関数
    private final DoubleFunction<Double> invProDist;

    /**
     * コンストラクタ
     *
     * @param invProDist 確率分布の逆関数
     */
    public Transform(DoubleFunction<Double> invProDist) {
        this.invProDist = invProDist;
    }

    /**
     * 乱数を一つ生成
     *
     * @return 生成された乱数
     */
    @Override
    public double getNext() {


    }

}
