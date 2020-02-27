package com.wangyi.sdk.api.bean;

import lombok.Data;

@Data
public class ChatroomTopn {
    /**
     * topn值，可选值 1~500，默认值100
     */
    private Integer topn;
    /**
     * 需要查询的指标所在的时间坐标点，不提供则默认当前时间，单位秒/毫秒皆可
     */
    private Long timestamp;
    /**
     * 统计周期，可选值包括 hour/day, 默认hour
     */
    private String period;
    /**
     * 取排序值,可选值 active/enter/message,分别表示按日活排序，进入人次排序和消息数排序， 默认active
     */
    private String orderby;


    /**
     * 此方法参数可全部为null  都不是必填
     * @param topn
     * @param timestamp
     * @param period
     * @param orderby
     */
    public ChatroomTopn(Integer topn,Long timestamp, String period,String orderby){
        this.topn = topn;
        this.timestamp = timestamp;
        this.period = period;
        this.orderby = orderby;
    }
    public ChatroomTopn(){

    }
}
