package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author <a href="https://github.com/onesleepyjoker/friend-backend">一只小小丑</a>
 * @from <a href="https://github.com/onesleepyjoker/friend-backend">一只小小丑</a>
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
