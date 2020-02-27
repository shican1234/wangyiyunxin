package com.wangyi.sdk.api.API;


import com.wangyi.sdk.api.bean.*;
import com.wangyi.sdk.support.NIMPost;
import com.wangyi.sdk.support.Reflect;
import com.wangyi.sdk.support.UrlConst;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户消息托管
 */
public class RelationshipApi {
    private static Logger logger = LoggerFactory.getLogger(RelationshipApi.class);
    /**
     * 加好友  两人保持好友关系
     * @return
     * @throws IOException
     */
    public static String addFriend(FriendAdd add, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(add);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.FRIEND_ADD_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("addFriend httpRes: {}", res);
        return res;
    }

    /**
     * 更新好友相关信息 必须是好友才可以
     * @return
     * @throws IOException
     */
    public static String updateFriend(FriendUpdate update, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(update);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.FRIEND_UPDATE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("updateFriend httpRes: {}", res);
        return res;
    }

    /**
     * 删除好友
     * @return
     * @throws IOException
     */
    public static String deleteFriend(FriendDel del, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(del);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.FRIEND_DELETE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("deleteFriend httpRes: {}", res);
        return res;
    }

    /**
     * 获取好友关系
     * @return
     * @throws IOException
     */
    public static String getFriend(FriendGet friendGet, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(friendGet);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.FRIEND_GET_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("getFriend httpRes: {}", res);
        return res;
    }

    /**
     * 设置黑名单/静音
     * @return
     * @throws IOException
     */
    public static String setSpecialRelation(SpecialRelation specialRelation, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(specialRelation);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.SPECIAL_RELATION_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("setSpecialRelation httpRes: {}", res);
        return res;
    }

    /**
     * 查看指定用户的黑名单和静音列表
     * @return
     * @throws IOException
     */
    public static String listBlackAndMuteList(String accid, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("accid", accid));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.BLACK_MUTE_LIST_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("listBlackAndMuteList httpRes: {}", res);
        return res;
    }
}
