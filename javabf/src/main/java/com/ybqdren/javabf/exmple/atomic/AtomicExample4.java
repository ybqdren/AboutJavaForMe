package com.ybqdren.javabf.exmple.atomic;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Zhao Wen on 2021/2/2
 */

@Slf4j
public class AtomicExample4 {
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args){
        count.compareAndSet(0,2); // count = 2
        count.compareAndSet(0,1); // count=2 count!=0 所以count不执行
        count.compareAndSet(1,3);
        count.compareAndSet(2,4); // count==2 所以执行 count=4
        count.compareAndSet(3,5);
        System.out.println(count.get());
    }
}
