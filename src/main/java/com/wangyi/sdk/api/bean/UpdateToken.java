package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class UpdateToken {
    /**
     * 网易云通信ID，最大长度32字符，必须保证一个
     * APP内唯一（只允许字母、数字、半角下划线_、
     * @、半角点以及半角-组成，不区分大小写，
     * 会统一小写处理，请注意以此接口返回结果中的accid为准）。
     */
    private String accid;
    /**
     *该参数已不建议使用。
     */
    private String props;
    /**
     * 网易云通信ID可以指定登录token值，最大长度128字符，
     * 并更新，如果未指定，会自动生成token，并在
     * 创建成功后返回
     */
    private String token;
    public UpdateToken(String accid,String props,String token){
        this.accid = accid;
        this.props = props;
        this.token = token;
    }
    public UpdateToken(){
    }
}
