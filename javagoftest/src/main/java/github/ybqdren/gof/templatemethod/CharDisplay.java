package github.ybqdren.gof.templatemethod;

/**
 * Created by Zhao Wen on 2021/1/28
 */

// 继承AbstractDisplay CharDisplay是AbstractDisplay的子类
public class CharDisplay extends AbstractDisplay{

    // 需要显示的字符
    private char ch;

    // 构造函数中接收的字符被
    public CharDisplay(char ch) {
        // 保存在指定字段中
        this.ch = ch;
    }

    // open在父类中是抽象方法
    @Override
    public void open() {
        // 此处重写该方法
        // 显示开始字符"<<"
        System.out.print("<<");
    }

    // 重写print方法
    // 该方法会在display中被重复调用
    @Override
    public void print() {
        // 显示保存在字段ch中的字符
        System.out.print(ch);
    }

    // 重写close方法
    @Override
    public void close() {
        // 显示结束字符">>"
        System.out.println(">>");
    }
}
