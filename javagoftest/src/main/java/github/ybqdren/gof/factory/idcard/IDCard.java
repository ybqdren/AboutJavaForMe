package github.ybqdren.gof.factory.idcard;

import github.ybqdren.gof.factory.framework.Product;

/**
 * Created by Zhao Wen on 2021/1/31
 */

public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作"+owner+"的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
