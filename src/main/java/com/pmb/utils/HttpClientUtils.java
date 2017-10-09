package com.pmb.utils;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: he.feng
 * \* Date: 2017/9/22
 * \* Description:
 * \
 */
public class HttpClientUtils {

    public static String httpPostForText(String url) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost  = new HttpPost(url);
        httpPost.setHeader("Accept-Charset","utf-8");
        String responseContent = null;
        CloseableHttpResponse response = null;


        try {

            response = httpClient.execute(httpPost);
            if(response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                responseContent = EntityUtils.toString(entity, Consts.UTF_8);
            }else {
                System.out.println("HTTP访问失败" + response.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }

            } finally {
                if (httpClient != null) {
                    httpClient.close();
                }
            }
        }
        return responseContent;
    }

}
