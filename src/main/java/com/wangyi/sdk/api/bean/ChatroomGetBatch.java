package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomGetBatch {
    /**
     *多个roomid，格式为：["6001","6002","6003"]（JSONArray对应的roomid，如果解析出错，会报414错误），限20个roomid
     */
    private String roomids;
    /**
     * 是否需要返回在线人数，true或false，默认false
     */
    private Boolean needOnlineUserCount;

    public ChatroomGetBatch(String roomids){
        this.roomids = roomids;
    }
    public ChatroomGetBatch(){

    }
}
