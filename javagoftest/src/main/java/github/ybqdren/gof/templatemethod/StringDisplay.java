package github.ybqdren.gof.templatemethod;

/**
 * Created by Zhao Wen on 2021/1/28
 */

// 给显示的字符加上特殊的效果
public class StringDisplay extends AbstractDisplay {

    // 需要显示的字符串
    private String string;

    // 以字节为单位计算出的字符串长度
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+this.string+"|");
    }

    @Override
    public void close() {
        printLine();
    }

    // 被open和close方法调用
    private void printLine(){
        System.out.print("+");
        for(int i = 0;i < width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
