package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomTemporaryMute {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 操作者accid,必须是管理员或创建者
     */
    private String operator;
    /**
     * 被禁言的目标账号accid
     */
    private String target;
    /**
     * 0:解除禁言;>0设置禁言的秒数，不能超过2592000秒(30天)
     */
    private Long muteDuration;
    /**
     * 操作完成后是否需要发广播，true或false，默认true
     */
    private Boolean needNotify;
    /**
     * 通知广播事件中的扩展字段，长度限制2048字符
     */
    private String notifyExt;


    public ChatroomTemporaryMute(Long roomid, String operator,String target,Long muteDuration){
        this.roomid = roomid;
        this.operator = operator;
        this.target = target;
        this.muteDuration = muteDuration;
    }
    public ChatroomTemporaryMute(){

    }
}
