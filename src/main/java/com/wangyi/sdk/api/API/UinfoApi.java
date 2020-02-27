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
 * 用户名片
 */
public class UinfoApi {
    private static Logger logger = LoggerFactory.getLogger(UinfoApi.class);
    /**
     * 更新用户名片
     * @return
     * @throws IOException
     */
    public static String updateUinfo(Uinfo uinfo, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(uinfo);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.UPDATE_UINFO_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("updateUinfo httpRes: {}", res);
        return res;
    }

    /**
     * 获取用户名片
     * @return
     * @throws IOException
     *
     */
    public static String getUinfos(String accids, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("accids", accids));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.GET_UINFO_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("getUinfos httpRes: {}", res);
        return res;
    }


}
