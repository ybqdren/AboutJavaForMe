package github.ybqdren.gof.factory.framework;

/**
 * Created by Zhao Wen on 2021/1/31
 */

/**
 * framework包中的Product类是用来表示“产品”的类。
 * 在该类中仅声明了use抽象方法。use方法的实现则被交给了Product类的子类负责。
 * 在这个框架中，定义了产品是“任意的可以use”的东西
 */
public abstract class Product {
    public abstract void use();
}
