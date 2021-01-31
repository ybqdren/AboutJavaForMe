package github.ybqdren.gof.factory;

import github.ybqdren.gof.factory.framework.Factory;
import github.ybqdren.gof.factory.framework.Product;
import github.ybqdren.gof.factory.idcard.IDCardFactory;

/**
 * Created by Zhao Wen on 2021/1/31
 */

public class main {
    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
