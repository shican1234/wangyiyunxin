package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomUpdateMyRoomRole {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 需要变更角色信息的accid
     */
    private String accid;
    /**
     * 	变更的信息是否需要持久化，默认false，仅对聊天室固定成员生效
     */
    private Boolean save;
    /**
     * 是否需要做通知
     */
    private Boolean needNotify;
    /**
     * 通知的内容，长度限制2048
     */
    private String notifyExt;
    /**
     * 聊天室室内的角色信息：昵称，不超过64个字符
     */
    private String nick;
    /**
     * 聊天室室内的角色信息：头像
     */
    private String avator;
    /**
     * 聊天室室内的角色信息：开发者扩展字段
     */
    private String ext;


    public ChatroomUpdateMyRoomRole(Long roomid, String accid, Boolean save, Boolean needNotify, String notifyExt,String nick,String avator,String ext){
        this.roomid = roomid;
        this.accid = accid;
        this.save = save;
        this.needNotify = needNotify;
        this.notifyExt = notifyExt;
        this.nick = nick;
        this.avator = avator;
        this.ext = ext;
    }
    public ChatroomUpdateMyRoomRole(){

    }
}
