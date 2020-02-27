package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomRequestAddr {
    /**
     *聊天室id
     */
    private Long roomid;
    /**
     * 进入聊天室的账号
     */
    private String accid;
    /**
     * 1:weblink（客户端为web端时使用）; 2:commonlink（客户端为非web端时使用）;3:wechatlink(微信小程序使用), 默认1
     */
    private Integer clienttype;
    /**
     * 客户端ip，传此参数时，会根据用户ip所在地区，返回合适的地址
     */
    private String clientip;


    public ChatroomRequestAddr(Long roomid, String accid){
        this.roomid = roomid;
        this.accid = accid;
    }
    public ChatroomRequestAddr(){

    }
}
