package com.oneinlet;

/**
 * 代理类
 */
public class ProxyMysql implements Mysql {
    private Mysql mysql;
    @Override
    public void read() {
        if(!readRedisDB()){
            mysql = new MysqlImpl();
            mysql.read();
        }
    }

    /*模拟查询redis数据库*/
    private boolean readRedisDB() {
        int num = (int) (Math.random() * 11);
        if(num>5){
            System.out.println("命中缓存，查询redis数据返回");
            return true;
        }
        return false;
    }
}
