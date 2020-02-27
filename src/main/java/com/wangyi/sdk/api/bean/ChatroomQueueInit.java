package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomQueueInit {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 队列长度限制，0~1000
     */
    private Long sizeLimit;



    public ChatroomQueueInit(Long roomid, Long sizeLimit){
        this.roomid = roomid;
        this.sizeLimit = sizeLimit;
    }
    public ChatroomQueueInit(){

    }
}
