package Strategy.before;

/**
 * 静态的看这个程序，似乎也什么问题，但是程序员应该有时间轴的概念
 * 如果客户需要增加其他国家的税收计算，则需要修改这部分源码，这违背
 * 了 “开闭原则” ==> 对扩展开放，对修改关闭
 */

public class SalesOrder {
    TaxBase tax;
    public double CalculateTax(){
        double sumTax = 0;
        // ...
        if(tax == TaxBase.CN_Tax){
            // ...
        }
        else if(tax == TaxBase.US_Tax){
            // ...
        }
        else if(tax == TaxBase.DE_Tax){
            // ...
        }
        // ...
        return sumTax;
    }
}
