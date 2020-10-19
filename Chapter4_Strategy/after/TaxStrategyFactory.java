package Strategy.after;

import Strategy.after.Strategy.CNTax;
import Strategy.after.Strategy.TaxStrategy;

/**
 * 还没学到工厂模式，为了策略模式定义的完整性，简单采用CNTax类模拟了其中的工厂方法，
 * 并非真正的工厂模式
 */
public class TaxStrategyFactory {
    public TaxStrategy newStrategy(){
        return new CNTax();
    }
}
