package io.rong.models.response;

import io.rong.models.Result;
import io.rong.util.GsonUtil;

/**
 * user.info 返回结果
 */
public class UserInfoResult extends Result {
  // 用户id
  String id;
  // 用户名
  String userName;
  // 用户头像
  String userPortrait;
  // 用户注册时间
  String createTime;


  /**
   * @return id
   */
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  /**
   * @return userName
   */
  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * @return userPortrait
   */
  public String getUserPortrait() {
    return userPortrait;
  }


  public void setUserPortrait(String userPortrait) {
    this.userPortrait = userPortrait;
  }


  /**
   * @return createTime
   */
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  @Override
  public String toString() {
    return GsonUtil.toJson(this, UserInfoResult.class);
  }
}
