package com.yupi.yupao.model.request;

// 本项目_所属 [一只小小丑](https://github.com/onesleepyjoker/friend-backend)

import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author <a href="https://github.com/onesleepyjoker/friend-backend">一只小小丑</a>
 * @from <a href="https://github.com/onesleepyjoker/friend-backend">一只小小丑</a>
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
