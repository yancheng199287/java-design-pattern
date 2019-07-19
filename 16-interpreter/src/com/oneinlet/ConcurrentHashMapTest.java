package com.oneinlet;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * description: ConcurrentHashMap测试类
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date 2019/7/19 12:50 PM
 */
public class ConcurrentHashMapTest {
   static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(test());
        }
    }

    private static int test() throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) {
            pool.execute(new Task(map));
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);

        return map.get(Task.KEY);
    }
}

class Task implements Runnable {

    public static final String KEY = "key";

    private ConcurrentHashMap<String, Integer> map;

    public Task(ConcurrentHashMap<String, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 对共享对象map上锁
            synchronized (map) {
                //调用堆栈方法线程安全 已经对map上锁下边方法不需要再上锁
                this.addup();
            }
        }
    }

    private void addup() {
        if (!map.containsKey(KEY)) {
            map.put(KEY, 1);
        } else {
            map.put(KEY, map.get(KEY) + 1);
        }
    }

}
