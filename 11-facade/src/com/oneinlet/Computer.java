package com.oneinlet;

/**
 * Created by WangZiHe on 19-7-12
 * QQ/WeChat:648830605
 * QQ-Group:368512253
 * Blog:www.520code.net
 * Github:https://github.com/yancheng199287
 */
public class Computer {
    private Component cpuComponent;
    private Component ramComponent;
    private Component diskComponent;

    public Computer() {
        this.cpuComponent = new CpuComponent();
        this.ramComponent = new RAMComponent();
        this.diskComponent = new DiskComponent();
    }


    public void cpuAbility() {
        cpuComponent.ability();
    }

    public void ramAbility() {
        ramComponent.ability();
    }

    public void diskAbility() {
        diskComponent.ability();
    }
}
