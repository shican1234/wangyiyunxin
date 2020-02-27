package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class Donnop {
    /**
     * 网易云通信ID，最大长度32字符，必须保证一个
     * APP内唯一（只允许字母、数字、半角下划线_、
     * @、半角点以及半角-组成，不区分大小写，
     * 会统一小写处理，请注意以此接口返回结果中的accid为准）。
     */
    private String accid;
    /**
     * 桌面端在线时，移动端是否不推送：
     * true:移动端不需要推送，false:移动端需要推送
     */
    private Boolean donnopOpen;

    public Donnop(String accid, Boolean donnopOpen){
        this.accid = accid;
        this.donnopOpen = donnopOpen;
    }
    public Donnop(){
    }
}
