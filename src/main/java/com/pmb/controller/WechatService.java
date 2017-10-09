package com.pmb.controller;

import com.pmb.utils.HttpClientUtils;

import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: he.feng
 * \* Date: 2017/9/22
 * \* Description:
 * \
 */
public class WechatService {

    public String wechatTest() throws IOException {

        //第一步，用户同意授权，获取code
        String url1 = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" +
                "wx6f9c63ee69f58d67" +
                "&redirect_uri=" +
                "http://2cfce53a.ngrok.io/hello/wechatTest" +
                "&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
        String result = HttpClientUtils.httpPostForText(url1);
        return result;
    }

}
