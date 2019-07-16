package com.oneinlet;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *全局信息key不能重复
 */
public class Context {
    private final ConcurrentMap<String, Integer> valueMap = new ConcurrentHashMap<String, Integer>();

    public void addValue(final String key, final int value) {
        if(!valueMap.containsKey(key)){
            /**确保多线程读取到同一个key只能有一个线程添加成功*/
            synchronized (valueMap){
                valueMap.put(key, Integer.valueOf(value));
            }
        }else {
            throw new RuntimeException("key不能重复插入");
        }
    }

    /***
     * 读取线程可见不用加锁
     * @param key
     * @return
     */
    public int getValue(final String key) {
        return valueMap.get(key).intValue();
    }
}
