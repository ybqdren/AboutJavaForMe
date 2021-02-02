package com.ybqdren.javabf.exmple.atomic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by Zhao Wen on 2021/2/2
 */

@Slf4j
public class AtomicExample5 {

    private static AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class,"count");

    @Getter
    public volatile  int count = 100;

    public static void main(String[] args) throws InterruptedException {

        AtomicExample5 example5 = new AtomicExample5();

        if(updater.compareAndSet(example5,100,120)){
            System.out.println(example5);
        }
    }

}
