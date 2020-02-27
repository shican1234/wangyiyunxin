package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class BatchMsg {
    /**
     * 发送者accid，用户帐号，最大32字符，
     * 必须保证一个APP内唯一
     */
    private String fromAccid;
    /**
     * ["aaa","bbb"]（JSONArray对应的accid，如果解析出错，会报414错误），限500人
     */
    private String toAccids;
    /**
     * 0 表示文本消息,
     * 1 表示图片，
     * 2 表示语音，
     * 3 表示视频，
     * 4 表示地理位置信息，
     * 6 表示文件，
     * 100 自定义消息类型
     */
    private Integer type;
    /**
     * 最大长度5000字符，JSON格式(消息格式参考
     * https://dev.yunxin.163.com/docs/product/IM%E5%8D%B3%E6%97%B6%E9%80%9A%E8%AE%AF/%E6%9C%8D%E5%8A%A1%E7%AB%AFAPI%E6%96%87%E6%A1%A3/%E6%B6%88%E6%81%AF%E5%8A%9F%E8%83%BD?#%E6%B6%88%E6%81%AF%E6%A0%BC%E5%BC%8F%E7%A4%BA%E4%BE%8B)
     */
    private String body;
    /**
     * 	发消息时特殊指定的行为选项,JSON格式，可用于指定消息的漫游，存云端历史，发送方多端同步，推送，消息抄送等特殊行为;option中字段不填时表示默认值 ，option示例:
     *
     * {"push":false,"roam":true,"history":false,"sendersync":true,"route":false,"badge":false,"needPushNick":true}
     *
     * 字段说明：
     * 1. roam: 该消息是否需要漫游，默认true（需要app开通漫游消息功能）；
     * 2. history: 该消息是否存云端历史，默认true；
     * 3. sendersync: 该消息是否需要发送方多端同步，默认true；
     * 4. push: 该消息是否需要APNS推送或安卓系统通知栏推送，默认true；
     * 5. route: 该消息是否需要抄送第三方；默认true (需要app开通消息抄送功能);
     * 6. badge:该消息是否需要计入到未读计数中，默认true;
     * 7. needPushNick: 推送文案是否需要带上昵称，不设置该参数时默认true;
     * 8. persistent: 是否需要存离线消息，不设置该参数时默认true。
     */
    private String option;
    /**
     *推送文案，最长500个字符，android以此为推送显示文案；ios若未填写payload，显示文案以pushcontent为准。
     */
    private String pushcontent;
    /**
     * 推送对应的payload,必须是JSON,不能超过2k字符。
     */
    private String payload;
    /**
     * 开发者扩展字段，长度限制1024字符
     */
    private String ext;
    /**
     * 可选，反垃圾业务ID，实现“单条消息配置对应反垃圾”，若不填则使用原来的反垃圾配置
     */
    private String bid;

    /**
     * 是否需要返回消息ID
     * false：不返回消息ID（默认值）
     * true：返回消息ID（toAccids包含的账号数量不可以超过100个）
     */
    private Boolean returnMsgid;

    /**
     * 此方法只有必填项
     * @param fromAccid
     * @param toAccids
     * @param type
     * @param body
     */
    public BatchMsg(String fromAccid,String toAccids, Integer type, String body){
        this.fromAccid = fromAccid;
        this.toAccids = toAccids;
        this.type = type;
        this.body = body;
    }
    public BatchMsg(){

    }
}
