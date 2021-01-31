package github.ybqdren.gof.factory.framework;

/**
 * Created by Zhao
 * Wen on 2021/1/31
 */

/**
 * 在framework包中的Factory类中，我们使用了Template Method模式
 * 该类还声明了用于“生产产品”的createProduct抽象方法和用于“注册产品”的
 * registerProduct抽象方法。“生产产品”和“注册产品”的具体处理则被交给了Factory类的子类负责。
 *
 * 在这个框架中，我们定义了工厂是用来“调用create方法生成Product实例”的。
 * 而create方法的实现是调用createProduct生成产品，接着调用registerProduct注册的产品。
 *
 * 只要是Factory Method模式，在生成实例时就一定会使用到Template Method模式。
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract  Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
