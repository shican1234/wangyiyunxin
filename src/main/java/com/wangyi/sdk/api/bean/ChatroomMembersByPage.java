package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomMembersByPage {
    /**
     * 聊天室id
     */
    private Long roomid;
    /**
     * 需要查询的成员类型,0:固定成员;1:非固定成员;2:仅返回在线的固定成员
     */
    private Integer type;
    /**
     * 单位毫秒，按时间倒序最后一个成员的时间戳,0表示系统当前时间
     */
    private Long endtime;
    /**
     * 返回条数，<=100
     */
    private Long limit;



    public ChatroomMembersByPage(Long roomid,Integer type, Long endtime, Long limit){
        this.roomid = roomid;
        this.type = type;
        this.endtime = endtime;
        this.limit = limit;
    }
    public ChatroomMembersByPage(){

    }
}
