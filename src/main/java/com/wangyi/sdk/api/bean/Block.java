package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class Block {
    /**
     * 网易云通信ID，最大长度32字符，必须保证一个
     * APP内唯一（只允许字母、数字、半角下划线_、
     * @、半角点以及半角-组成，不区分大小写，
     * 会统一小写处理，请注意以此接口返回结果中的accid为准）。
     */
    private String accid;
    /**
     *是否踢掉被禁用户，true或false，默认false。 非必选
     */
    private Boolean needkick;

    public Block(String accid,Boolean needkick){
        this.accid = accid;
        this.needkick = needkick;
    }
    public Block(){

    }
}
