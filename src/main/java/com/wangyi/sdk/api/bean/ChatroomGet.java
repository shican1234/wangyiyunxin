package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomGet {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 是否需要返回在线人数，true或false，默认false
     */
    private Boolean needOnlineUserCount;

    public ChatroomGet(Long roomid){
        this.roomid = roomid;
    }
    public ChatroomGet(){

    }
}
