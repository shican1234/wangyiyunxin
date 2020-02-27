package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class FriendDel {
    /**
     * 加好友发起者accid 必填
     */
    private String accid;
    /**
     * 要修改朋友的accid 必填
     */
    private String faccid;

    /**
     *	是否需要删除备注信息
     * 默认false:不需要，true:需要
     */
    private Boolean isDeleteAlias;

    public FriendDel(String accid, String faccid, Boolean isDeleteAlias){
        this.accid = accid;
        this.faccid = faccid;
        this.isDeleteAlias = isDeleteAlias;
    }
    public FriendDel(){
    }
}
