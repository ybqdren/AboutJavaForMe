package github.ybqdren.gof.adpter;

/**
 * Created by Zhao Wen on 2021/1/25
 * Main 类 的作用是通过扮演适配器角色PrintBanner类来弱化（带括号）
 * 或者是强化Hello(带*号)字符串的显示
 */

public class Main {
    public static void main(String[] args){
        Print p = new PrintBanner("Hello");
        p.printWeak();;
        p.printStrong();
    }
}
