package com.wangyi.sdk.api;

import com.alibaba.fastjson.JSON;
import com.wangyi.sdk.api.API.AuthApi;
import com.wangyi.sdk.api.API.UinfoApi;
import com.wangyi.sdk.api.bean.*;
import com.wangyi.sdk.support.UUIDUtil;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class UinfoApiTest {

    private static  YunXinConfig yunXinConfig = new YunXinConfig("147a0cb9db2ed68240d268b352378f9b","d0bc13837850");

    @Test
    public void updateUinfo() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        Uinfo uinfo = new Uinfo("shican131214","霸气的杀猪佬",null,null,"1208296327@qq.com","1993-01-01","18349373569",1,"测试");
        String user = UinfoApi.updateUinfo(uinfo, yunXinConfig);
        System.out.println(user);
    }
    @Test
    public void getUinfos() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, IOException {
        List<String> accids = new ArrayList<>();
        accids.add("972290997");
        accids.add("shican131214");
        String s = JSON.toJSONString(accids);
        String uinfos = UinfoApi.getUinfos(s, yunXinConfig);
        System.out.println(uinfos);
    }

}