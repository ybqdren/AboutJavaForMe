package main.java.github.ybqdren.gof.singleton;

public class Main {
    public static void main(String[] args){
        System.out.println("Start");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if(singleton1 == singleton){
            System.out.println("两个是相同的实例");
        }else{
            System.out.println("两个不相同");
        }
        System.out.println("End.");
    }
}
