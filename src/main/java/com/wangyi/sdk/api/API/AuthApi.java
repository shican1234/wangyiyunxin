package com.wangyi.sdk.api.API;


import com.wangyi.sdk.api.bean.Block;
import com.wangyi.sdk.api.bean.UpdateToken;
import com.wangyi.sdk.api.bean.YunXinConfig;
import com.wangyi.sdk.api.bean.YunXinUser;
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
 * 网易云通信ID
 */
public class AuthApi {
    private static Logger logger = LoggerFactory.getLogger(AuthApi.class);
    /**
     * 创建网易云通信ID111
     * @return
     * @throws IOException
     */
    public static String createUser(YunXinUser yunXinUser, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(yunXinUser);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.USER_CREATE_ID_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("createUser httpRes: {}", res);
        return res;
    }

    /**
     * 更新网易云通信token 此方法只会返回状态值
     * @return
     * @throws IOException
     *
     */
    public static String updateToken(UpdateToken updateToken, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(updateToken);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.UPDATE_TOKEN_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("updateToken httpRes: {}", res);
        return res;
    }

    /**
     * 重置网易云通信token
     * @return
     * @throws IOException
     *
     */
    public static String refreshToken(String accid, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("accid", accid));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.REFRESH_TOKEN_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("refreshToken httpRes: {}", res);
        return res;
    }
    /**
     * 封禁网易云通信ID
     * @return
     * @throws IOException
     *
     */
    public static String block(Block block, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(block);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.BLOCK_USER_ID_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("block httpRes: {}", res);
        return res;
    }

    /**
     * 解禁网易云通信ID
     * @return
     * @throws IOException
     *
     */
    public static String unblock(String accid, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("accid", accid));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.UNBLOCK_USER_ID_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("unblock httpRes: {}", res);
        return res;
    }
}
