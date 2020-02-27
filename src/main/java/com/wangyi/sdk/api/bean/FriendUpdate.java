package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class FriendUpdate {
    /**
     * 加好友发起者accid 必填
     */
    private String accid;
    /**
     * 要修改朋友的accid 必填
     */
    private String faccid;

    /**
     *给好友增加备注名，限制长度128，可设置为空字符串
     */
    private String alias;
    /**
     *修改ex字段，限制长度256，可设置为空字符串
     */
    private String ex;
    /**
     *修改serverex字段，限制长度256，可设置为空字符串
     * 此字段client端只读，server端读写
     */
    private String serverex;

    public FriendUpdate(String accid, String faccid,String alias,String ex, String serverex){
        this.accid = accid;
        this.faccid = faccid;
        this.alias = alias;
        this.ex = ex;
        this.serverex = serverex;
    }
    public FriendUpdate(){
    }
}
