package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class FriendAdd {
    /**
     * 加好友发起者accid 必填
     */
    private String accid;
    /**
     * 加好友接收者accid 必填
     */
    private String faccid;

    /**
     * 1直接加好友，2请求加好友，3同意加好友，4拒绝加好友
     */
    private Integer type;
    /**
     *加好友对应的请求消息，第三方组装，最长256字符
     */
    private String msg;
    /**
     *服务器端扩展字段，限制长度256
     * 此字段client端只读，server端读写
     */
    private String serverex;

    public FriendAdd(String accid, String faccid, Integer type, String msg, String serverex){
        this.accid = accid;
        this.faccid = faccid;
        this.type = type;
        this.msg = msg;
        this.serverex = serverex;
    }
    public FriendAdd(){
    }
}
