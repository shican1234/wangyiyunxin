package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomCreate {
    /**
     *聊天室属主的账号accid
     */
    private String creator;
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
     *扩展字段，最长4096字符
     */
    private String ext;

    /**
     * 队列管理权限：0:所有人都有权限变更队列，1:只有主播管理员才能操作变更。默认0
     */
    private Integer queuelevel;

    /**
     * 此方法为必填
     * @param from
     * @param msgtype
     * @param to
     * @param attach
     */
    public ChatroomCreate(String creator,String name){
        this.creator = creator;
        this.name = name;
    }
    public ChatroomCreate(){

    }
}
