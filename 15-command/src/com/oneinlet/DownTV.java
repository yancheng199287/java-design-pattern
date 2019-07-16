package com.oneinlet;

/**
 * 关机
 */
public class DownTV implements TV{

    private RequestClass request;

    public DownTV(RequestClass request) {
        this.request = request;
    }
    @Override
    public void execute() {
        request.down();

    }
}
