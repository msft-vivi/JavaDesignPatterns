package Strategy.after.Strategy;
import Strategy.after.Parameters;

/**
 * 扩展
 * 新的用户需求：增加法国税费计算
 */
public class FRTax implements TaxStrategy{
    @Override
    public double caculate(Parameters parameters) {
        return 0;
    }
}
