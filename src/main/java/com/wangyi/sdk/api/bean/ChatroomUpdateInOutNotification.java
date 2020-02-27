package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomUpdateInOutNotification {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 	true/false, 是否关闭进出通知
     */
    private Boolean close;
    public ChatroomUpdateInOutNotification(Long roomid, Boolean close){
        this.roomid = roomid;
        this.close = close;
    }
    public ChatroomUpdateInOutNotification(){

    }
}
