package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class FriendGet {
    /**
     * 加好友发起者accid 必填
     */
    private String accid;
    /**
     * 更新时间戳，接口返回该时间戳之后有更新的好友列表
     */
    private Long updatetime;

    /**
     * 定义同updatetime 已经弃用
     */
    private Long createtime;

    public FriendGet(String accid, Long updatetime,Long createtime){
        this.accid = accid;
        this.updatetime = updatetime;
        this.createtime = createtime;
    }
    public FriendGet(){
    }
}
