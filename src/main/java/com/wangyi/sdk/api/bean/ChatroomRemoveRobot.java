package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomRemoveRobot {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 机器人账号accid列表，必须是有效账号，账号数量上限100个
     */
    private String accids;


    public ChatroomRemoveRobot(Long roomid, String accids){
        this.roomid = roomid;
        this.accids = accids;
    }
    public ChatroomRemoveRobot(){

    }
}
