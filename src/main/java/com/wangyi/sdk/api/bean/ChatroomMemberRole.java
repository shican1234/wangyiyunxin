package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomMemberRole {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 操作者账号accid
     */
    private String operator;
    /**
     * 被操作者账号accid
     */
    private String target;
    /**
     * 操作：
     * 1: 设置为管理员，operator必须是创建者
     * 2:设置普通等级用户，operator必须是创建者或管理员
     * -1:设为黑名单用户，operator必须是创建者或管理员
     * -2:设为禁言用户，operator必须是创建者或管理员
     */
    private Integer opt;
    /**
     * 	true或false，true:设置；false:取消设置；
     * 执行“取消”设置后，若成员非禁言且非黑名单，则变成游客
     */
    private Boolean optvalue;
    /**
     * 通知扩展字段，长度限制2048，请使用json格式
     */
    private String notifyExt;


    public ChatroomMemberRole(Long roomid, String operator,String target,Integer opt,Boolean optvalue){
        this.roomid = roomid;
        this.operator = operator;
        this.target = target;
        this.opt = opt;
        this.optvalue = optvalue;
    }
    public ChatroomMemberRole(){

    }
}
