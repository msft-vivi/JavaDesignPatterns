package Strategy.after.Context;

import Strategy.after.Parameters;
import Strategy.after.Strategy.TaxStrategy;
import Strategy.after.TaxStrategyFactory;


/**
 * SalesOrder 是策略模式中 Concrete Context (具体上下文)
 *
 * 注：代码仅展示核心逻辑，并非全部可执行
 */
public class SalesOrder {
    TaxStrategy taxStrategy; // 持有策略接口引用，声明为接口类型，而不是具体类

//    public SalesOrder(TaxStrategy taxStrategy) {
//        this.taxStrategy = taxStrategy;
//    }

    // 更好的方法是使用工厂模式创建策略对象
    public SalesOrder(TaxStrategyFactory taxStrategyFactory) {
        this.taxStrategy = taxStrategyFactory.newStrategy();
    }

    // executeStrategy
    public double calculateTax(){
        // ...

        // parameters 不同国家计算税需要的信息,需要根据不同国家而改变，为了程序完整性简单 new了个对象
        double val = taxStrategy.caculate(new Parameters());

        // ...

        return val;
    }
}
