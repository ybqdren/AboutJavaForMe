package main.java.github.ybqdren.gof.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * Singleton类的构造函数是Private的，这是为了禁止从Singleton类外部调用构造函数
     * Singleton模式的作用在于可以确保任何情况下都只能生成一个实例，所以为了达到这个目的，必须设置构造函数为private
     */
    private Singleton(){
        System.out.println("生成一个实例");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
