package io.rong.methods.chatroom.whitelist;

import io.rong.RongCloud;
/**
 *
 * 聊天室用户白名单服务
 * docs: "http://www.rongcloud.cn/docs/server.html#chatroom_user_whitelist"
 *
 * @author RongCloud
 * */
public class Whitelist {
//    private static final String UTF8 = "UTF-8";
//    private static final String PATH = "chatroom/whitelist";
    private String appKey;
    private String appSecret;
    private RongCloud rongCloud;
    public User user;
    public Messages message;

    public RongCloud getRongCloud() {
        return rongCloud;
    }
    public void setRongCloud(RongCloud rongCloud) {
        this.rongCloud = rongCloud;
        message.setRongCloud(rongCloud);
        user.setRongCloud(rongCloud);
    }
    public Whitelist(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.message = new Messages(appKey,appSecret);
        this.user = new User(appKey,appSecret);
    }
    /**
     * @return appKey
     */
    public String getAppKey() {
      return appKey;
    }
    public void setAppKey(String appKey) {
      this.appKey = appKey;
    }
    /**
     * @return appSecret
     */
    public String getAppSecret() {
      return appSecret;
    }
    public void setAppSecret(String appSecret) {
      this.appSecret = appSecret;
    }
}
