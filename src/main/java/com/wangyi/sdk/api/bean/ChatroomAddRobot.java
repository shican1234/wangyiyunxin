package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomAddRobot {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 机器人账号accid列表，必须是有效账号，账号数量上限100个
     */
    private String accids;
    /**
     * 机器人信息扩展字段，请使用json格式，长度4096字符
     */
    private String roleExt;
    /**
     * 机器人进入聊天室通知的扩展字段，请使用json格式，长度2048字符
     */
    private String notifyExt;


    public ChatroomAddRobot(Long roomid, String accids){
        this.roomid = roomid;
        this.accids = accids;
    }
    public ChatroomAddRobot(){

    }
}
