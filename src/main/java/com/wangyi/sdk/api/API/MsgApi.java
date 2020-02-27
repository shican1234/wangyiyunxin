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
 * 发送消息
 */
public class MsgApi {
    private static Logger logger = LoggerFactory.getLogger(MsgApi.class);
    /**
     * 发送普通消息
     * @return
     * @throws IOException
     */
    public static String sendMsg(SendMsg sendMsg, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(sendMsg);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.SEND_MSG_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("sendMsg httpRes: {}", res);
        return res;
    }

    /**
     * 批量发送点对点普通消息
     * @return
     * @throws IOException
     *
     */
    public static String sendBatchMsg(BatchMsg batchMsg, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(batchMsg);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.SEND_BATC_MSG_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("sendBatchMsg httpRes: {}", res);
        return res;
    }

    /**
     * 发送自定义系统通知
     * @return
     * @throws IOException
     *
     */
    public static String sendAttachMsg(AttachMsg attachMsg, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(attachMsg);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.SEND_ATTACH_MSG_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("sendAttachMsg httpRes: {}", res);
        return res;
    }

    /**
     * 文件上传 base64
     * @return
     * @throws IOException
     *
     */
    public static String upload(Upload upload, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(upload);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.UPLOAD_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("upload httpRes: {}", res);
        return res;
    }

    /**
     * 消息撤回
     * @return
     * @throws IOException
     *
     */
    public static String recall(Recall recall, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(recall);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.RECALL_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("recall: {}", res);
        return res;
    }
    /**
     * 发送广播消息  该方法需要申请开通广播消息才能发送
     * @return
     * @throws IOException
     *
     */
    public static String broadcastMsg(BroadcastMsg broadcastMsg, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(broadcastMsg);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.BROAD_CAST_MSG_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("broadcastMsg: {}", res);
        return res;
    }
}
