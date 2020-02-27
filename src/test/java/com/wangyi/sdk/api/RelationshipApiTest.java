package com.wangyi.sdk.api;

import com.wangyi.sdk.api.API.RelationshipApi;
import com.wangyi.sdk.api.API.UserSettingApi;
import com.wangyi.sdk.api.bean.*;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class RelationshipApiTest {

    private static  YunXinConfig yunXinConfig = new YunXinConfig("147a0cb9db2ed68240d268b352378f9b","d0bc13837850");

    @Test
    public void addFriend() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        FriendAdd add = new FriendAdd("shican1234","972290997",1,"你好!",null);
        String s = RelationshipApi.addFriend(add, yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void updateFriend() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        FriendUpdate update = new FriendUpdate("shican1234","shican131214aaa","贼鸡儿牛逼a的奥特曼",null,null);
        String s = RelationshipApi.updateFriend(update, yunXinConfig);
        System.out.println(s);

    }
    @Test
    public void deleteFriend() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        FriendDel del = new FriendDel("shican1234","972290997",false);
        String s = RelationshipApi.deleteFriend(del, yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void getFriend() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        FriendGet friendGet = new FriendGet("shican1234",1582635608000l,1582635608000l);
        String s = RelationshipApi.getFriend(friendGet, yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void setSpecialRelation() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        SpecialRelation specialRelation = new SpecialRelation("shican1234","shican131214aaa",1,1);
        String s = RelationshipApi.setSpecialRelation(specialRelation, yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void listBlackAndMuteList() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String s = RelationshipApi.listBlackAndMuteList("shican1234", yunXinConfig);
        System.out.println(s);
    }
}