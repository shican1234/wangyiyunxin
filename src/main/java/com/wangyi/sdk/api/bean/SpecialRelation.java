package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
/**
 * 所有参数必填
 */
public class SpecialRelation {
    /**
     * 用户帐号，最大长度32字符，必须保证一个
     * APP内唯一
     */
    private String accid;
    /**
     * 被加黑或加静音的帐号
     */
    private String targetAcc;

    /**
     *本次操作的关系类型,1:黑名单操作，2:静音列表操作
     */
    private Integer relationType;
    /**
     *操作值，0:取消黑名单或静音，1:加入黑名单或静音
     */
    private Integer value;

    public SpecialRelation(String accid, String targetAcc,Integer relationType,Integer value){
        this.accid = accid;
        this.targetAcc = targetAcc;
        this.relationType = relationType;
        this.value = value;
    }
    public SpecialRelation(){
    }
}
