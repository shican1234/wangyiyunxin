package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class AttachMsg {
    /**
     * 发送者accid，用户帐号，最大32字符，
     * 必须保证一个APP内唯一
     */
    private String from;
    /**
     * 0：点对点自定义通知，1：群消息自定义通知，其他返回414
     */
    private Integer msgtype;
    /**
     * msgtype==0是表示accid即用户id，msgtype==1表示tid即群id
     */
    private String to;
    /**
     * 自定义通知内容，第三方组装的字符串，建议是JSON串，最大长度4096字符
     */
    private String attach;
    /**
     *推送文案，最长500个字符，android以此为推送显示文案；ios若未填写payload，显示文案以pushcontent为准。
     */
    private String pushcontent;
    /**
     * iOS推送对应的payload,必须是JSON,不能超过2k字符
     */
    private String payload;
    /**
     * 如果有指定推送，此属性指定为客户端本地的声音文件名，长度不要超过30个字符，如果不指定，会使用默认声音
     */
    private String sound;
    /**
     * 1表示只发在线，2表示会存离线，其他会报414错误。默认会存离线
     */
    private Integer save;
    /**
     * 发消息时特殊指定的行为选项,Json格式，可用于指定消息计数等特殊行为;option中字段不填时表示默认值。
     * option示例：
     * {"badge":false,"needPushNick":false,"route":false}
     * 字段说明：
     * 1. badge:该消息是否需要计入到未读计数中，默认true;
     * 2. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认false(ps:注意与sendMsg.action接口有别);
     * 3. route: 该消息是否需要抄送第三方；默认true (需要app开通消息抄送功能)
     */
    private String option;

    /**
     * 此方法为必填
     * @param from
     * @param msgtype
     * @param to
     * @param attach
     */
    public AttachMsg(String from, Integer msgtype, String to, String attach){
        this.from = from;
        this.msgtype = msgtype;
        this.to = to;
        this.attach = attach;
    }
    public AttachMsg(){

    }
}
