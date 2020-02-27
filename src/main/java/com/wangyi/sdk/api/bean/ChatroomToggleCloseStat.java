package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomToggleCloseStat {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 操作者账号，必须是创建者才可以操作
     */
    private String operator;
    /**
     * true或false，false:关闭聊天室；true:打开聊天室
     */
    private Boolean valid;


    public ChatroomToggleCloseStat(Long roomid, String operator,Boolean valid){
        this.roomid = roomid;
        this.operator = operator;
        this.valid = valid;
    }
    public ChatroomToggleCloseStat(){

    }
}
