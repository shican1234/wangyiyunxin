package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomQueueBatchUpdateElements {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 操作者accid,必须是管理员或创建者
     */
    private String operator;
    /**
     * 更新的key-value对，最大200个，示例：{"k1":"v1","k2":"v2"}
     */
    private String elements;
    /**
     * 	true或false,是否需要发送更新通知事件，默认true
     */
    private Boolean needNotify;

    /**
     * 通知事件扩展字段，长度限制2048
     */
    private String notifyExt;
    public ChatroomQueueBatchUpdateElements(Long roomid, String operator,String elements){
        this.roomid = roomid;
        this.operator = operator;
        this.elements = elements;
    }
    public ChatroomQueueBatchUpdateElements(){

    }
}
