package github.ybqdren.gof.adpter.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhao Wen on 2021/1/28
 */

public class ForTest {
        public static void main(String[] args) {
            Map<Integer,String> map = new HashMap<>();
            map.put(1,"面向对象编程");
            map.put(2,"面向过程编程");
            map.put(3,"面向函数编程");

            map.forEach((k,v)->{
                System.out.println(k+"--->"+v);
            });

    }

    private void forTest02(Map map){
        for(Object i : map.keySet()){
            System.out.println(i+"--->"+map.get(i));
        }
    }

    private void forTest01(Map map){
        for(int i=1;i<=map.size();i++){
            System.out.println(i+"--->"+map.get(i));
        }
    }
}
