package github.ybqdren.gof.templatemethod;

/**
 * Created by Zhao Wen on 2021/1/28
 */

public class Main {
    public static void main(String[] args){
        // 生成一个持有'H'的CharDisplay类的实例
        CharDisplay charDisplay = new CharDisplay('H');
        // 生成一个持有"Hello,world."的StringDisplay类的实例
        StringDisplay stringDisplay = new StringDisplay("Hello,world.");
        StringDisplay stringDisplay_2 = new StringDisplay("你好，世界。");
        charDisplay.display();
        stringDisplay.display();
        stringDisplay_2.display();
    }
}
