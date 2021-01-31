package github.ybqdren.gof.factory.idcard;

import github.ybqdren.gof.factory.framework.Factory;
import github.ybqdren.gof.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhao Wen on 2021/1/31
 */

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add((IDCard)product.getOwners());
    }

    public List getOwners(){
        return owners;
    }
}
