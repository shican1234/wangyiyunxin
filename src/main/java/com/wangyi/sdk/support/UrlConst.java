package com.wangyi.sdk.support;

public class UrlConst {

    /**
     *  网易云通信ID相关
     */
    //创建网易云通信ID
    public static String USER_CREATE_ID_URL = "https://api.netease.im/nimserver/user/create.action";
    //更新网易云通信token
    public static String UPDATE_TOKEN_URL = "https://api.netease.im/nimserver/user/update.action";
    //重置网易云通信token
    public static String REFRESH_TOKEN_URL = "https://api.netease.im/nimserver/user/refreshToken.action";
    //封禁网易云通信ID
    public static String BLOCK_USER_ID_URL = "https://api.netease.im/nimserver/user/block.action";
    //解禁网易云通信ID
    public static String UNBLOCK_USER_ID_URL = "https://api.netease.im/nimserver/user/unblock.action";

    /**
     * 用户名片相关
     */
    //更新用户名片
    public static String UPDATE_UINFO_URL = "https://api.netease.im/nimserver/user/updateUinfo.action";
    //获取用户名片
    public static String GET_UINFO_URL = "https://api.netease.im/nimserver/user/getUinfos.action";

    /**
     * 用户设置相关
     */
    //设置桌面端在线时，移动端是否需要推送
    public static String SET_DONNOP_URL = "https://api.netease.im/nimserver/user/setDonnop.action";
    //账号全局禁言
    public static String MUTE_URL = "https://api.netease.im/nimserver/user/mute.action";
    //账号全局禁用音视频
    public static String MUTE_AV_URL = "https://api.netease.im/nimserver/user/muteAv.action";

    /**
     * 用户关系托管
     */
    //加好友   .两人保持好友关系
    public static String FRIEND_ADD_URL = "https://api.netease.im/nimserver/friend/add.action";
    //更新好友相关信息   必须是好友才可以
    public static String FRIEND_UPDATE_URL = "https://api.netease.im/nimserver/friend/update.action";
    //删除好友
    public static String FRIEND_DELETE_URL = "https://api.netease.im/nimserver/friend/delete.action";
    //获取好友关系   查询某时间点起到现在有更新的双向好友
    public static String FRIEND_GET_URL = "https://api.netease.im/nimserver/friend/get.action";
    //设置黑名单/静音  拉黑/取消拉黑；设置静音/取消静音
    public static String SPECIAL_RELATION_URL = "https://api.netease.im/nimserver/user/setSpecialRelation.action";
    //查看指定用户的黑名单和静音列表
    public static String BLACK_MUTE_LIST_URL = "https://api.netease.im/nimserver/user/listBlackAndMuteList.action";
    /**
     * 消息相关
     */
    //发送普通消息
    public static String SEND_MSG_URL = "https://api.netease.im/nimserver/msg/sendMsg.action";
    //批量发送点对点普通消息
    public static String SEND_BATC_MSG_URL = "https://api.netease.im/nimserver/msg/sendBatchMsg.action";
    //发送自定义系统通知
    public static String SEND_ATTACH_MSG_URL = "https://api.netease.im/nimserver/msg/sendAttachMsg.action";
    //文件上传
    public static String UPLOAD_URL = "https://api.netease.im/nimserver/msg/upload.action";
    //消息撤回
    public static String RECALL_URL = "https://api.netease.im/nimserver/msg/recall.action";
    //发送广播消息
    public static String BROAD_CAST_MSG_URL = "https://api.netease.im/nimserver/msg/broadcastMsg.action";

    /**
     * 聊天室相关
     */
    //创建聊天室
    public static String CHATROOM_CREATE_URL = "https://api.netease.im/nimserver/chatroom/create.action";
    //查询聊天室信息
    public static String CHATROOM_GET_URL = "https://api.netease.im/nimserver/chatroom/get.action";
    //批量查询聊天室信息
    public static String CHATROOM_GET_BATCH_URL = "https://api.netease.im/nimserver/chatroom/getBatch.action";
    //更新聊天室信息
    public static String CHATROOM_UPDATE_URL = "https://api.netease.im/nimserver/chatroom/update.action";
    //修改聊天室开/关闭状态
    public static String CHATROOM_TOGGLE_CLOSE_STAT_URL = "https://api.netease.im/nimserver/chatroom/toggleCloseStat.action";
    //设置聊天室内用户角色
    public static String CHATROOM_SET_MEMBER_ROLE_URL = "https://api.netease.im/nimserver/chatroom/setMemberRole.action";
    //请求聊天室地址
    public static String CHATROOM_GET_ADDS_URL = "https://api.netease.im/nimserver/chatroom/requestAddr.action";
    //发送聊天室消息
    public static String CHATROOM_SEND_MSG_URL = "https://api.netease.im/nimserver/chatroom/sendMsg.action";
    //往聊天室内添加机器人
    public static String CHATROOM_ADD_ROBOT_URL = "https://api.netease.im/nimserver/chatroom/addRobot.action";
    //从聊天室内删除机器人
    public static String CHATROOM_REMOVE_ROBOT_URL = "https://api.netease.im/nimserver/chatroom/removeRobot.action";
    //设置临时禁言状态
    public static String CHATROOM_TEMPORARY_MUTE_URL = "https://api.netease.im/nimserver/chatroom/temporaryMute.action";
    //往聊天室有序队列中新加或更新元素
    public static String CHATROOM_QUEUE_OFFER_URL = "https://api.netease.im/nimserver/chatroom/queueOffer.action";
    //从队列中取出元素
    public static String CHATROOM_QUEUE_POLL_URL = "https://api.netease.im/nimserver/chatroom/queuePoll.action";
    //排序列出队列中所有元素
    public static String CHATROOM_QUEUE_LIST_URL = "https://api.netease.im/nimserver/chatroom/queueList.action";
    //删除清理整个队列
    public static String CHATROOM_QUEUE_DROP_URL = "https://api.netease.im/nimserver/chatroom/queueDrop.action";
    //初始化队列
    public static String CHATROOM_QUEUE_INIT_URL = "https://api.netease.im/nimserver/chatroom/queueInit.action";
    //将聊天室整体禁言
    public static String CHATROOM_MUTE_ROOM_URL = "https://api.netease.im/nimserver/chatroom/muteRoom.action";
    //查询聊天室统计指标TopN
    public static String CHATROOM_TOPN_URL = "https://api.netease.im/nimserver/stats/chatroom/topn.action";
    //分页获取成员列表
    public static String CHATROOM_MEMBERS_PAGE_URL = "https://api.netease.im/nimserver/chatroom/membersByPage.action";
    //批量获取在线成员信息
    public static String CHATROOM_QUERY_MEMBERS_URL = "https://api.netease.im/nimserver/chatroom/queryMembers.action";
    //变更聊天室内的角色信息
    public static String CHATROOM_UPDATE_MYROOM_ROLE_URL = "https://api.netease.im/nimserver/chatroom/updateMyRoomRole.action";
    //批量更新聊天室队列元素
    public static String CHATROOM_QUEUE_BATCH_UPDATE_ELEMENTS_URL = "https://api.netease.im/nimserver/chatroom/queueBatchUpdateElements.action";
    //查询用户创建的开启状态聊天室列表
    public static String CHATROOM_QUERY_USER_ROOMIDS_URL = "https://api.netease.im/nimserver/chatroom/queryUserRoomIds.action";
    //关闭指定聊天室进出通知
    public static String CHATROOM_UPDATE_IN_OUT_NOTIFICATION_URL = "https://api.netease.im/nimserver/chatroom/updateInOutNotification.action";
}