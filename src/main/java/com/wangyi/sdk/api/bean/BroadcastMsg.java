package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class BroadcastMsg {
    /**
     * 广播消息内容，最大4096字符
     */
    private String body;
    /**
     * 发送者accid, 用户帐号，最大长度32字符，必须保证一个APP内唯一  非必填
     */
    private String from;
    /**
     * 是否存离线，true或false，默认false
     */
    private Boolean isOffline;
    /**
     * 存离线状态下的有效期，单位小时，默认7天 非必填
     */
    private Integer ttl;
    /**
     * 目标客户端，默认所有客户端，jsonArray，格式：["ios","aos","pc","web","mac"]
     */
    private String targetOs;


    //此方法只有必填项
    public BroadcastMsg(String body){

        this.body = body;
    }
    public BroadcastMsg(){

    }
}
