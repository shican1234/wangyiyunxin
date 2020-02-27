package com.wangyi.sdk.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wangyi.sdk.api.API.ChatRoomApi;
import com.wangyi.sdk.api.API.UinfoApi;
import com.wangyi.sdk.api.bean.*;
import com.wangyi.sdk.support.UUIDUtil;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatRoomApiTest {

    private static  YunXinConfig yunXinConfig = new YunXinConfig("e0f4cfb273a704070b85be6dc228d08f","1cd6f3a4a4ae");

    @Test
    public void chatroom_create() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomCreate chatroomCreate = new ChatroomCreate("shican1234","吹牛打屁房间");
        String chatroom = ChatRoomApi.chatroom_create(chatroomCreate, yunXinConfig);
        System.out.println(chatroom);
        //返回{"chatroom":{"roomid":159436937,"valid":true,"announcement":null,"queuelevel":0,"muted":false,"name":"吹牛打屁房间","broadcasturl":null,"ext":"","creator":"shican1234"},"code":200}
    }

    @Test
    public void chatroom_get() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomGet chatroomGet = new ChatroomGet(159436937l);
//        chatroomGet.setNeedOnlineUserCount(true);
        String chatroom_get = ChatRoomApi.chatroom_get(chatroomGet, yunXinConfig);
        System.out.println(chatroom_get);
        //返回{"chatroom":{"roomid":159436937,"valid":true,"announcement":null,"queuelevel":0,"muted":false,"name":"吹牛打屁房间","broadcasturl":null,"ext":"","creator":"shican1234"},"code":200}
    }
    @Test
    public void chatroom_getBatch() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        List<String> ids = new ArrayList<>();
        ids.add("159436937");
        String roomids = JSON.toJSONString(ids);
        ChatroomGetBatch chatroomGet = new ChatroomGetBatch(roomids);
//        chatroomGet.setNeedOnlineUserCount(true);
        String chatroom_getBatch = ChatRoomApi.chatroom_getBatch(chatroomGet, yunXinConfig);
        System.out.println(chatroom_getBatch);
        /**
         * 返回
         * {"noExistRooms":[],"succRooms":[{"roomid":159436937,"valid":true,"announcement":null,
         * "queuelevel":0,"muted":false,"name":"吹牛打屁房间","broadcasturl":null,"ext":"","creator":"shican1234"}],"code":200,"failRooms":[]}
         * noExistRooms  不存在的聊天室id列表
         * failRooms 失败的聊天室id,有可能是查的时候有500错误
         */
    }
    @Test
    public void chatroom_update() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomUpdate update = new ChatroomUpdate(159436937l,"相亲",null,null,null,null,null,null);
        String s = ChatRoomApi.chatroom_update(update, yunXinConfig);
        System.out.println(s);
        /**
         * {"chatroom":{"roomid":159436937,"valid":true,"announcement":null,"queuelevel":0,"muted":false,"name":"相亲","broadcasturl":null,"ext":"","creator":"shican1234"},"code":200}
         */
    }
    @Test
    public void chatroom_toggleCloseStat() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomToggleCloseStat chatroomToggleCloseStat = new ChatroomToggleCloseStat(159436937l,"shican1234",false);
        String s = ChatRoomApi.chatroom_toggleCloseStat(chatroomToggleCloseStat, yunXinConfig);
        System.out.println(s);
        /**
         * {"roomid":159436937,"valid":false,"desc":{"roomid":159436937,"valid":false,"announcement":null,"queuelevel":0,"muted":false,"name":"相亲","broadcasturl":null,"ext":"","creator":"shican1234"},"announcement":null,
         * "muted":false,"queuelevel":0,"name":"相亲","code":200,"broadcasturl":null,"ext":"","creator":"shican1234"}
         */
    }
    @Test
    public void chatroom_setMemberRole() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        //将shican12345设置为shican1234的聊天室的管理员
        ChatroomMemberRole chatroomMemberRole = new ChatroomMemberRole(159436937l,"shican1234","shican12345",1,true);
        String s = ChatRoomApi.chatroom_setMemberRole(chatroomMemberRole, yunXinConfig);
        System.out.println(s);
        /**
         * {"roomid":159436937,"valid":true,"desc":{"roomid":159436937,"valid":true,"level":0,"accid":"shican12345","type":"MANAGER"},"level":0,"accid":"shican12345","code":200,"type":"MANAGER"}
         */
    }
    @Test
    public void chatroom_requestAddr() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        //shican12345进入shican1234的聊天室
        ChatroomRequestAddr chatroomRequestAddr = new ChatroomRequestAddr(159436937l,"shican12345");
        String s = ChatRoomApi.chatroom_requestAddr(chatroomRequestAddr, yunXinConfig);
        System.out.println(s);
        /**
         * {"addr":["weblink03.netease.im:443"],"code":200}
         */
    }
    @Test
    public void chatroom_sendMsg() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Map<String,String> msgmap = new HashMap<>();
        msgmap.put("msg","哈哈哈哈!");
        Object msg = JSONObject.toJSON(msgmap);
        ChatroomSendMsg chatroomSendMsg = new ChatroomSendMsg(159436937l, UUIDUtil.getUUID(),"shican12345",0,msg.toString());
        String s = ChatRoomApi.chatroom_sendMsg(chatroomSendMsg, yunXinConfig);
        System.out.println(s);
        /**
         * {"desc":{"time":"1582775631790","fromAvator":"","msgid_client":"ebb6add7cbd04d9c82efb6cdcbfb1b6d","fromClientType":"REST","attach":"{\"msg\":\"哈哈哈哈!\"}","roomId":"159436937",
         * "fromAccount":"shican12345","fromNick":"","type":"0","ext":""},"code":200}
         */
    }
    @Test
    public void chatroom_addRobot() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        List<String> accids = new ArrayList<>();
        accids.add("shican123456");
        accids.add("shican1234567");
        String s = JSON.toJSONString(accids);
        ChatroomAddRobot chatroomAddRobot = new ChatroomAddRobot(159436937l,s);
        String addRobot = ChatRoomApi.chatroom_addRobot(chatroomAddRobot, yunXinConfig);
        System.out.println(addRobot);
        /**
         * {"desc":{"oldAccids":"[]","successAccids":"[\"shican123456\",\"shican1234567\"]","failAccids":"[]"},"code":200}
         */
    }
    @Test
    public void chatroom_removeRobot() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        List<String> accids = new ArrayList<>();
        accids.add("shican123456");
        String s = JSON.toJSONString(accids);
        ChatroomRemoveRobot removeRobot = new ChatroomRemoveRobot(159436937l,s);
        String removeRobotRobot = ChatRoomApi.chatroom_removeRobot(removeRobot, yunXinConfig);
        System.out.println(removeRobotRobot);
        /**
         * {"desc":{"successAccids":"[\"shican123456\"]","failAccids":"[]"},"code":200}
         */
    }
    @Test
    public void chatroom_temporaryMute() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomTemporaryMute chatroomTemporaryMute = new ChatroomTemporaryMute(159436937l,"shican12345","shican1234567",1000l);
        String temporaryMute = ChatRoomApi.chatroom_temporaryMute(chatroomTemporaryMute, yunXinConfig);
        System.out.println(temporaryMute);
        /**
         * {"desc":{"muteDuration":1000},"code":200}
         */
    }
    @Test
    public void chatroom_queueOffer() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomQueueOffer chatroomQueueOffer = new ChatroomQueueOffer(159436937l,"q1","v1");
        chatroomQueueOffer.setTranSient(false);
        String queueOffer = ChatRoomApi.chatroom_queueOffer(chatroomQueueOffer, yunXinConfig);
        System.out.println(queueOffer);
        /**
         * {"desc":{},"code":200}
         */
    }
    @Test
    public void chatroom_queuePoll() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomQueuePoll chatroomQueuePoll = new ChatroomQueuePoll(159436937l,"1111");
        String queuePoll = ChatRoomApi.chatroom_queuePoll(chatroomQueuePoll, yunXinConfig);
        System.out.println(queuePoll);
        /**
         * {"desc":{"value":"2222","key":"1111"},"code":200}  取出了该元素后 该元素就从队列消失
         */
    }
    @Test
    public void chatroom_queueList() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String queuePoll = ChatRoomApi.chatroom_queueList(159436937l, yunXinConfig);
        System.out.println(queuePoll);
        /**
         * {"desc":{"list":[{"wqwqwq":"wqwqqw"}]},"code":200}
         */
    }
    @Test
    public void chatroom_queueDrop() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String queueDrop = ChatRoomApi.chatroom_queueDrop(159436937l, yunXinConfig);
        System.out.println(queueDrop);
        /**
         * {"desc":{},"code":200}
         */
    }
    @Test
    public void chatroom_queueInit() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomQueueInit chatroomQueueInit = new ChatroomQueueInit(159436937l,10l);
        String queueInit = ChatRoomApi.chatroom_queueInit(chatroomQueueInit, yunXinConfig);
        System.out.println(queueInit);
        /**
         * {"desc":{},"code":200}
         */
    }
    @Test
    public void chatroom_muteRoom() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomMuteRoom chatroomMuteRoom = new ChatroomMuteRoom(159436937l,"shican1234",true);
        String chatroom_muteRoom = ChatRoomApi.chatroom_muteRoom(chatroomMuteRoom, yunXinConfig);
        System.out.println(chatroom_muteRoom);
        /**
         * {"desc":{"success":true},"code":200}
         */
    }
    @Test
    public void chatroom_topn() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomTopn chatroomTopn = new ChatroomTopn(null,null,null,null);
        String chatroom_topn = ChatRoomApi.chatroom_topn(chatroomTopn, yunXinConfig);
        System.out.println(chatroom_topn);
        /**
         * 官方返回
         * {
         *   "code": 200,
         *   "data": [
         *     {
         *       "activeNums": 5955,       // 该聊天室内的活跃数
         *       "datetime": 1471712400,   // 统计时间点，单位秒，按天统计的是当天的0点整点；按小时统计的是指定小时的整点
         *       "enterNums": 18621,       // 进入人次数量
         *       "msgs": 2793,             // 聊天室内发生的消息数
         *       "period": "HOUR",         // 统计周期，HOUR表示按小时统计；DAY表示按天统计
         *       "roomId": 3571337         // 聊天室ID号
         *     },
         *     {
         *       "activeNums": 6047,
         *       "datetime": 1471708800,
         *       "enterNums": 15785,
         *       "msgs": 2706,
         *       "period": "HOUR",
         *       "roomId": 3573737
         *     },
         *     {
         *       "activeNums": 5498,
         *       "datetime": 1471708800,
         *       "enterNums": 14590,
         *       "msgs": 2258,
         *       "period": "HOUR",
         *       "roomId": 3513774
         *     }
         *   ]
         * }
         */
    }
    @Test
    public void chatroom_membersByPage() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomMembersByPage chatroomMembersByPage = new ChatroomMembersByPage(159436937l,0,0l,10l);
        String byPage = ChatRoomApi.chatroom_membersByPage(chatroomMembersByPage, yunXinConfig);
        System.out.println(byPage);
        /**
         * {
         *     "desc":{
         *         "data":[
         *             {
         *                 "roomid":159436937,
         *                 "level":0,
         *                 "nick":"",
         *                 "accid":"shican12345",
         *                 "enterTime":1582775004819,
         *                 "type":"MANAGER",
         *                 "onlineStat":false,
         *                 "ext":"",
         *                 "avator":null
         *             },
         *             {
         *                 "roomid":159436937,
         *                 "level":0,
         *                 "nick":"",
         *                 "accid":"shican1234",
         *                 "enterTime":1582723029219,
         *                 "type":"CREATOR",
         *                 "onlineStat":false,
         *                 "ext":"",
         *                 "avator":null
         *             }
         *         ]
         *     },
         *     "code":200
         * }
         */
    }
    @Test
    public void chatroom_queryMembers() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        List<String> accids = new ArrayList<>();
        accids.add("shican1234");
        String s = JSON.toJSONString(accids);
        ChatroomQueryMembers chatroomQueryMembers = new ChatroomQueryMembers(159436937l,s);
        String queryMembers = ChatRoomApi.chatroom_queryMembers(chatroomQueryMembers, yunXinConfig);
        System.out.println(queryMembers);
        /**
         * {"desc":{"data":[{"roomid":159436937,"level":0,"nick":"","accid":"shican1234","type":"CREATOR","onlineStat":false,"ext":null,"avator":null}]},"code":200}
         */
    }
    @Test
    public void chatroom_updateMyRoomRole() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomUpdateMyRoomRole chatroomUpdateMyRoomRole = new ChatroomUpdateMyRoomRole(159436937l,"shican12345",true,true,"变更角色信息","杀猪佬",null,null);
        String updateMyRoomRole = ChatRoomApi.chatroom_updateMyRoomRole(chatroomUpdateMyRoomRole, yunXinConfig);
        System.out.println(updateMyRoomRole);
        /**
         * {"code":200}
         */
    }
    @Test
    public void chatroom_queueBatchUpdateElements() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Map<String,String> map = new HashMap<>();
        map.put("q1","v11");
        map.put("q2","v22");
        Object object = JSONObject.toJSON(map);
        ChatroomQueueBatchUpdateElements chatroomQueueBatchUpdateElements = new ChatroomQueueBatchUpdateElements(159436937l,"shican1234",object.toString());
        String chatroom_queueBatchUpdateElements = ChatRoomApi.chatroom_queueBatchUpdateElements(chatroomQueueBatchUpdateElements, yunXinConfig);
        System.out.println(chatroom_queueBatchUpdateElements);
        /**
         * {"desc":{"noExistElementKey":[]},"code":200}  noExistElementKey是不存在的key
         */
    }
    @Test
    public void chatroom_queryUserRoomIds() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String chatroom_queryUserRoomIds = ChatRoomApi.chatroom_queryUserRoomIds("shican1234", yunXinConfig);
        System.out.println(chatroom_queryUserRoomIds);
        /**
         *{"desc":{"roomids":["159436937"]},"code":200}
         */
    }
    @Test
    public void chatroom_updateInOutNotification() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        ChatroomUpdateInOutNotification chatroomUpdateInOutNotification = new ChatroomUpdateInOutNotification(159436937l,true);
        String chatroom_updateInOutNotification = ChatRoomApi.chatroom_updateInOutNotification(chatroomUpdateInOutNotification, yunXinConfig);
        System.out.println(chatroom_updateInOutNotification);
        /**
         *{"code":200}
         */
    }
}