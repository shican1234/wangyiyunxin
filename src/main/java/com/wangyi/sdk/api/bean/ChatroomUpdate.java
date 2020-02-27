package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomUpdate {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 聊天室名称，长度限制128个字符
     */
    private String name;
    /**
     * 公告，长度限制4096个字符
     */
    private String announcement;
    /**
     * 直播地址，长度限制1024个字符
     */
    private String broadcasturl;
    /**
     * 扩展字段，长度限制4096个字符
     */
    private String ext;
    /**
     * true或false,是否需要发送更新通知事件，默认true
     */
    private Boolean needNotify;
    /**
     * 通知事件扩展字段，长度限制2048
     */
    private String notifyExt;
    /**
     * 队列管理权限：0:所有人都有权限变更队列，1:只有主播管理员才能操作变更
     */
    private Integer queuelevel;
    public ChatroomUpdate(Long roomid,String name,String announcement,String broadcasturl,String ext,Boolean needNotify,String notifyExt,Integer queuelevel){
        this.roomid = roomid;
        this.name = name;
        this.announcement = announcement;
        this.broadcasturl = broadcasturl;
        this.ext = ext;
        this.needNotify = needNotify;
        this.notifyExt = notifyExt;
        this.queuelevel = queuelevel;
    }
    public ChatroomUpdate(){

    }
}
