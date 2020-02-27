package com.wangyi.sdk.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wangyi.sdk.api.API.MsgApi;
import com.wangyi.sdk.api.API.UinfoApi;
import com.wangyi.sdk.api.bean.*;
import com.wangyi.sdk.support.NIMPost;
import com.wangyi.sdk.support.UrlConst;
import org.apache.http.entity.ContentType;
import org.junit.Test;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class MsgApiTest {

    private static  YunXinConfig yunXinConfig = new YunXinConfig("147a0cb9db2ed68240d268b352378f9b","d0bc13837850");

    @Test
    public void sendMsg() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Map<String,String> msgmap = new HashMap<>();
        msgmap.put("msg","哈哈哈哈!");
        Object msg = JSONObject.toJSON(msgmap);
        SendMsg sendMsg = new SendMsg("shican1234",0,"shican131214",0,msg.toString());
        String s = MsgApi.sendMsg(sendMsg, yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void sendBatchMsg() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Map<String,String> msgmap = new HashMap<>();
        msgmap.put("msg","哈哈哈哈!");
        Object msg = JSONObject.toJSON(msgmap);

        List<String> accids = new ArrayList<>();
        accids.add("972290997");
        accids.add("shican131214");
        String toAccids = JSON.toJSONString(accids);
        BatchMsg sendMsg = new BatchMsg("shican1234",toAccids,0,msg.toString());
        sendMsg.setReturnMsgid(true);
        String s = MsgApi.sendBatchMsg(sendMsg,yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void sendAttachMsg() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Map<String,String> msgmap = new HashMap<>();
        msgmap.put("ZDYXX","哈哈哈哈!");
        Object msg = JSONObject.toJSON(msgmap);

        AttachMsg attachMsg = new AttachMsg("shican1234",0,"972290997",msg.toString());
        String s = MsgApi.sendAttachMsg(attachMsg,yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void upload() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String s1 = ImageToBase64("E:\\timg.jpg");
        Upload upload = new Upload(s1);
        String s = MsgApi.upload(upload,yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void recall() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Recall recall = new Recall("360017503294",1582703330995l,7,"shican1234","shican131214");
        String recall1 = MsgApi.recall(recall, yunXinConfig);
        System.out.println(recall1);
    }
    @Test
    public void broadcastMsg() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        BroadcastMsg broadcastMsg = new BroadcastMsg("恭喜发财!");
        String broadcastMsg1 = MsgApi.broadcastMsg(broadcastMsg, yunXinConfig);
        System.out.println(broadcastMsg1);
    }
    /**
     * 本地图片转换Base64的方法
     *
     * @param imgPath     
     */

    private static String ImageToBase64(String imgPath) {
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgPath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        String encode = encoder.encode(Objects.requireNonNull(data));
        return encode;
    }

}