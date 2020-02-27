package com.wangyi.sdk.api;

import com.alibaba.fastjson.JSON;

import com.google.common.collect.ImmutableList;
import com.wangyi.sdk.api.API.AuthApi;
import com.wangyi.sdk.api.bean.Block;
import com.wangyi.sdk.api.bean.UpdateToken;
import com.wangyi.sdk.api.bean.YunXinConfig;
import com.wangyi.sdk.api.bean.YunXinUser;
import com.wangyi.sdk.support.UUIDUtil;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class AuthApiTest {

    private static  YunXinConfig yunXinConfig = new YunXinConfig("e0f4cfb273a704070b85be6dc228d08f","1cd6f3a4a4ae");

    @Test
    public void create() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        YunXinUser yunXinUser = new YunXinUser("shican1234567aa",null,UUIDUtil.getUUID());
        String user = AuthApi.createUser(yunXinUser, yunXinConfig);
        System.out.println(user);
    }
    @Test
    public void updateToken() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        UpdateToken yunXinUser = new UpdateToken("shican1234",null,null);
        String user = AuthApi.updateToken(yunXinUser, yunXinConfig);
        System.out.println(user);
    }
    @Test
    public void refreshToken() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String user = AuthApi.refreshToken("shican1234", yunXinConfig);
        System.out.println(user);
    }
    @Test
    public void block() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Block block = new Block("shican1234",false);
        String user = AuthApi.block(block, yunXinConfig);
        System.out.println(user);
    }
    @Test
    public void unblock() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        String user = AuthApi.unblock("shican1234", yunXinConfig);
        System.out.println(user);
    }


}