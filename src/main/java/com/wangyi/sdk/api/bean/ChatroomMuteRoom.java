package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomMuteRoom {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 操作者accid，必须是管理员或创建者
     */
    private String operator;
    /**
     * true或false
     */
    private Boolean mute;
    /**
     * true或false，默认true  具体干啥的不知道 网易云信的API就这几个备注 猜测是聊天室全部禁言是否发送通知  非必填
     */
    private Boolean needNotify;
    /**
     * 通知扩展字段
     */
    private String notifyExt;



    public ChatroomMuteRoom(Long roomid, String operator,Boolean mute){
        this.roomid = roomid;
        this.operator = operator;
        this.mute = mute;
    }
    public ChatroomMuteRoom(){

    }
}
