package github.ybqdren.gof.adpter02;

/**
 * Created by Zhao Wen on 2021/1/25
 */

public class Main {
    public static void main(String[] args){
        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();
    }
}
