package com.oneinlet;

/**
 * 开机
 */
public class OpenTV implements TV {

    private RequestClass request;

    public OpenTV(RequestClass request) {
        this.request = request;
    }

    @Override
    public void execute() {

        request.open();
    }
}
