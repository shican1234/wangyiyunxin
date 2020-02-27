package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class Upload {
    /**
     *字符流base64串(Base64.encode(bytes)) ，最大15M的字符流
     */
    private String content;
    /**
     * 上传文件类型
     */
    private String type;
    /**
     * 返回的url是否需要为https的url，true或false，默认false
     */
    private Boolean ishttps;
    /**
     * 文件过期时长，单位：秒，必须大于等于86400
     */
    private Integer expireSec;
    /**
     *文件的应用场景，不超过32个字符
     */
    private String tag;


    public Upload(String content){
        this.content = content;
    }
    public Upload(){

    }
}
