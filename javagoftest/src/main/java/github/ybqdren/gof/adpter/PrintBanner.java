package github.ybqdren.gof.adpter;

/**
 * Created by Zhao Wen on 2021/1/25
 *
 * 扮演一个“适配器”的角色
 * 继承了Banner类 继承了showWithParen方法和showWithAster方法
 * 又实现了Print接口 实现了printWeak方法和printStrong方法
 */

public class PrintBanner extends Banner implements  Print{
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
