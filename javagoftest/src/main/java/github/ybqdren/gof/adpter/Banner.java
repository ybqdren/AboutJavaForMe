package github.ybqdren.gof.adpter;

/**
 * Created by Zhao Wen on 2021/1/25
 * 现在实际情况
 */

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
