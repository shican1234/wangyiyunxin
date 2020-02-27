package com.wangyi.sdk.api;

import com.alibaba.fastjson.JSON;
import com.wangyi.sdk.api.API.UinfoApi;
import com.wangyi.sdk.api.API.UserSettingApi;
import com.wangyi.sdk.api.bean.Donnop;
import com.wangyi.sdk.api.bean.Mute;
import com.wangyi.sdk.api.bean.Uinfo;
import com.wangyi.sdk.api.bean.YunXinConfig;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class UserSettingApiTest {

    private static  YunXinConfig yunXinConfig = new YunXinConfig("147a0cb9db2ed68240d268b352378f9b","d0bc13837850");

    @Test
    public void setDonnop() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Donnop donnop = new Donnop("972290997",false);
        String s = UserSettingApi.setDonnop(donnop, yunXinConfig);
        System.out.println(s);
    }
    @Test
    public void mute() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Mute mute = new Mute("shican1234",false);
        String mute1 = UserSettingApi.mute(mute, yunXinConfig);
        System.out.println(mute1);

    }
    @Test
    public void mute_av() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Mute mute = new Mute("shican1234",false);
        String mute1 = UserSettingApi.mute_av(mute, yunXinConfig);
        System.out.println(mute1);
    }
}