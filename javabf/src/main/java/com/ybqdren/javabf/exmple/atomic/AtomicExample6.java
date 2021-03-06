package com.ybqdren.javabf.exmple.atomic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Created by Zhao Wen on 2021/2/2
 */

@Slf4j
public class AtomicExample6 {

    public static AtomicBoolean isHappend = new AtomicBoolean(false);

    public static int clientTotal = 5000;

    public static int threadTotal = 200;

    public static void main(String[] args) throws InterruptedException {
        // 定义线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 定义信号量
        final Semaphore semaphore= new Semaphore(threadTotal);

        // 统计请求结果 计数器闭锁
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

        // 发送请求
        for(int i = 0; i < clientTotal;i++){
            // 将请求放入线程池中
            executorService.execute(()->{
                try {
                    // 获取线程
                    semaphore.acquire();
                    test();
                    // 关闭线程
                    semaphore.release();
                }catch (Exception e){
                    System.out.println(e);
                }
                // 每执行完成一次后 线程池中的请求都会-1
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(isHappend.get());
    }

    private static void test(){
        if(isHappend.compareAndSet(false,true)){
            System.out.println("excute");
        }
    }

}
