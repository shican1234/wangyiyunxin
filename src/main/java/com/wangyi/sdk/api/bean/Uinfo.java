package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class Uinfo {
    /**
     * 网易云通信ID，最大长度32字符，必须保证一个
     * APP内唯一（只允许字母、数字、半角下划线_、
     * @、半角点以及半角-组成，不区分大小写，
     * 会统一小写处理，请注意以此接口返回结果中的accid为准）。
     */
    private String accid;
    /**
     * 网易云通信ID昵称，最大长度64字符
     */
    private String name;

    /**
     * 网易云通信ID头像URL，开发者可选填，最大长度1024
     */
    private String icon;
    /**
     *用户签名，最大长度256字符
     */
    private String sign;
    /**
     *用户email，最大长度64字符
     */
    private String email;
    /**
     *用户生日，最大长度16字符
     */
    private String birth;
    /**
     *用户mobile，最大长度32字符，非中国大陆手机号码需要填写国家代码(如美国：+1-xxxxxxxxxx)或地区代码(如香港：+852-xxxxxxxx)
     */
    private String mobile;
    /**
     * 用户性别，0表示未知，1表示男，2女表示女，其它会报参数错误
     */
    private int gender;
    /**
     *用户名片扩展字段，最大长度1024字符，用户可自行扩展，建议封装成JSON字符串
     */
    private String ex;

    /**
     *
     * @param accid
     * @param name
     * @param icon
     * @param sign
     * @param email
     * @param birth
     * @param mobile
     * @param gender
     * @param ex
     */
    public Uinfo(String accid, String name, String icon,String sign, String email, String birth,String mobile, int gender, String ex){
        this.accid = accid;
        this.name = name;
        this.icon = icon;
        this.sign = sign;
        this.email = email;
        this.birth = birth;
        this.mobile = mobile;
        this.gender = gender;
        this.ex = ex;
    }
    public Uinfo(){
    }
}
