package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class YunXinConfig {
    private String appKey;
    private String appSecret;
    private String nonce;
    private String curTime;
    private String checkSum;

    public YunXinConfig(String appKey,String appSecret){
        this.appKey = appKey;
        this.appSecret = appSecret;
    }
}
