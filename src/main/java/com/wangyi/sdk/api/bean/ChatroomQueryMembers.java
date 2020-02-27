package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomQueryMembers {
    /**
     * 聊天室id
     */
    private Long roomid;
    /**
     * ["abc","def"], 账号列表，最多200条 JSONArray格式字符串
     */
    private String accids;



    public ChatroomQueryMembers(Long roomid, String accids){
        this.roomid = roomid;
        this.accids = accids;
    }
    public ChatroomQueryMembers(){

    }
}
