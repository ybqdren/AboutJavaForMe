package github.ybqdren.gof.templatemethod;

/**
 * Created by Zhao Wen on 2021/1/28
 */

// 抽象类 AbstractDisplay
public abstract class AbstractDisplay {
    public abstract  void open(); // 交给子类去实现的抽象方法（1） open
    public abstract  void print(); // 交给子类去实现的抽象方法（2） print
    public abstract  void close(); // 交给子类去实现的抽象方法（3） close
    public final void display(){ // 本抽象类中实现的display方法
        open();
        for(int i = 0;i < 5;i++){
            print();
        }
        // 最后进行关闭。这就是display方法所实现的功能
        close();
    }
}
