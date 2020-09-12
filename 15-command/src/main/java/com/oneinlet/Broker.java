package com.oneinlet;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 */
public class Broker {
    private List<TV> tvList = new ArrayList<TV>();

    public void takeTV(TV tv){
        tvList.add(tv);
    }

    public void placeTVs(){
        for (TV tv : tvList) {
            tv.execute();
        }
        tvList.clear();
    }
}
