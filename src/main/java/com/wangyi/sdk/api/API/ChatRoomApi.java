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
 * 聊天室
 */
public class ChatRoomApi {
    private static Logger logger = LoggerFactory.getLogger(ChatRoomApi.class);
    /**
     * 创建聊天室
     * @return
     * @throws IOException
     */
    public static String chatroom_create(ChatroomCreate chatroomCreate, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomCreate);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_CREATE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_create httpRes: {}", res);
        return res;
    }

    /**
     * 查询聊天室信息
     * @return
     * @throws IOException
     */
    public static String chatroom_get(ChatroomGet chatroomGet, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomGet);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_GET_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_get httpRes: {}", res);
        return res;
    }

    /**
     * 批量查询聊天室信息
     * @return
     * @throws IOException
     */
    public static String chatroom_getBatch(ChatroomGetBatch chatroomGetBatch, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomGetBatch);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_GET_BATCH_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_getBatch httpRes: {}", res);
        return res;
    }
    /**
     * 更新聊天室信息
     * @return
     * @throws IOException
     */
    public static String chatroom_update(ChatroomUpdate update, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(update);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_UPDATE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_update httpRes: {}", res);
        return res;
    }
    /**
     * 修改聊天室开/关闭状态
     * @return
     * @throws IOException
     */
    public static String chatroom_toggleCloseStat(ChatroomToggleCloseStat chatroomToggleCloseStat, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomToggleCloseStat);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_TOGGLE_CLOSE_STAT_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_toggleCloseStat httpRes: {}", res);
        return res;
    }
    /**
     * 设置聊天室内用户角色
     * @return
     * @throws IOException
     */
    public static String chatroom_setMemberRole(ChatroomMemberRole chatroomMemberRole, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomMemberRole);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_SET_MEMBER_ROLE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_setMemberRole httpRes: {}", res);
        return res;
    }
    /**
     * 请求聊天室地址
     * @return
     * @throws IOException
     */
    public static String chatroom_requestAddr(ChatroomRequestAddr chatroomRequestAddr, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomRequestAddr);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_GET_ADDS_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_requestAddr httpRes: {}", res);
        return res;
    }
    /**
     * 发送聊天室消息
     * @return
     * @throws IOException
     */
    public static String chatroom_sendMsg(ChatroomSendMsg chatroomSendMsg, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomSendMsg);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_SEND_MSG_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_sendMsg httpRes: {}", res);
        return res;
    }
    /**
     * 往聊天室内添加机器人
     * @return
     * @throws IOException
     */
    public static String chatroom_addRobot(ChatroomAddRobot chatroomAddRobot, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomAddRobot);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_ADD_ROBOT_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_addRobot httpRes: {}", res);
        return res;
    }
    /**
     * 从聊天室内删除机器人
     * @return
     * @throws IOException
     */
    public static String chatroom_removeRobot(ChatroomRemoveRobot chatroomRemoveRobot, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomRemoveRobot);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_REMOVE_ROBOT_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_removeRobot httpRes: {}", res);
        return res;
    }
    /**
     * 设置临时禁言状态
     * @return
     * @throws IOException
     */
    public static String chatroom_temporaryMute(ChatroomTemporaryMute chatroomTemporaryMute, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomTemporaryMute);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_TEMPORARY_MUTE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_temporaryMute httpRes: {}", res);
        return res;
    }
    /**
     * 往聊天室有序队列中新加或更新元素
     * @return
     * @throws IOException
     */
    public static String chatroom_queueOffer(ChatroomQueueOffer chatroomQueueOffer, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Boolean tranSient = chatroomQueueOffer.getTranSient();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        if(tranSient != null){
            chatroomQueueOffer.setTranSient(null);
            params = Reflect.reflectTest(chatroomQueueOffer);
            params.add(new BasicNameValuePair("transient", tranSient.toString()));

        }else{
            params = Reflect.reflectTest(chatroomQueueOffer);
        }
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUEUE_OFFER_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queueOffer httpRes: {}", res);
        return res;
    }
    /**
     * 从队列中取出元素
     * @return
     * @throws IOException
     */
    public static String chatroom_queuePoll(ChatroomQueuePoll chatroomQueuePoll, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomQueuePoll);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUEUE_POLL_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queueOffer httpRes: {}", res);
        return res;
    }
    /**
     * 排序列出队列中所有元素
     * @return
     * @throws IOException
     */
    public static String chatroom_queueList(Long roomid, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("roomid", roomid.toString()));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUEUE_LIST_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queueList httpRes: {}", res);
        return res;
    }
    /**
     * 删除清理整个队列
     * @return
     * @throws IOException
     */
    public static String chatroom_queueDrop(Long roomid, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("roomid", roomid.toString()));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUEUE_DROP_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queueDrop httpRes: {}", res);
        return res;
    }

    /**
     * 初始化队列
     * @return
     * @throws IOException
     */
    public static String chatroom_queueInit(ChatroomQueueInit chatroomQueueInit, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomQueueInit);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUEUE_INIT_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queueInit httpRes: {}", res);
        return res;
    }
    /**
     * 将聊天室整体禁言
     * @return
     * @throws IOException
     */
    public static String chatroom_muteRoom(ChatroomMuteRoom chatroomMuteRoom, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomMuteRoom);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_MUTE_ROOM_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_muteRoom httpRes: {}", res);
        return res;
    }
    /**
     * 查询聊天室统计指标TopN
     * 1、根据时间戳，按指定周期列出聊天室相关指标的TopN列表
     * 2、当天的统计指标需要到第二天才能查询
     * 3、仅支持查询最近30天的统计指标
     * @return
     * @throws IOException
     */
    public static String chatroom_topn(ChatroomTopn chatroomTopn, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomTopn);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_TOPN_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_topn httpRes: {}", res);
        return res;
    }

    /**
     * 分页获取成员列表
     */
    public static String chatroom_membersByPage(ChatroomMembersByPage chatroomMembersByPage, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomMembersByPage);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_MEMBERS_PAGE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_membersByPage httpRes: {}", res);
        return res;
    }
    /**
     * 批量获取在线成员信息
     */
    public static String chatroom_queryMembers(ChatroomQueryMembers chatroomQueryMembers, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomQueryMembers);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUERY_MEMBERS_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queryMembers httpRes: {}", res);
        return res;
    }
    /**
     * 变更聊天室内的角色信息
     */
    public static String chatroom_updateMyRoomRole(ChatroomUpdateMyRoomRole chatroomUpdateMyRoomRole, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomUpdateMyRoomRole);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_UPDATE_MYROOM_ROLE_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_updateMyRoomRole httpRes: {}", res);
        return res;
    }
    /**
     * 批量更新聊天室队列元素
     */
    public static String chatroom_queueBatchUpdateElements(ChatroomQueueBatchUpdateElements chatroomQueueBatchUpdateElements, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomQueueBatchUpdateElements);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUEUE_BATCH_UPDATE_ELEMENTS_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queueBatchUpdateElements httpRes: {}", res);
        return res;
    }
    /**
     * 查询用户创建的开启状态聊天室列表
     * creator 聊天室创建者accid
     */
    public static String chatroom_queryUserRoomIds(String creator, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("creator", creator));
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_QUERY_USER_ROOMIDS_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_queryUserRoomIds httpRes: {}", res);
        return res;
    }
    /**
     * 查询用户创建的开启状态聊天室列表
     * creator 聊天室创建者accid
     */
    public static String chatroom_updateInOutNotification(ChatroomUpdateInOutNotification chatroomUpdateInOutNotification, YunXinConfig yunXinConfig) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<NameValuePair> params = Reflect.reflectTest(chatroomUpdateInOutNotification);
        //UTF-8编码,解决中文问题
        HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
        String res = NIMPost.postNIMServer(UrlConst.CHATROOM_UPDATE_IN_OUT_NOTIFICATION_URL, entity, yunXinConfig.getAppKey(), yunXinConfig.getAppSecret());
        logger.info("chatroom_updateInOutNotification httpRes: {}", res);
        return res;
    }
}
