package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomQueuePoll {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * elementKey,新元素的UniqKey,长度限制128字符
     */
    private String key;



    public ChatroomQueuePoll(Long roomid, String key){
        this.roomid = roomid;
        this.key = key;
    }
    public ChatroomQueuePoll(){

    }
}
