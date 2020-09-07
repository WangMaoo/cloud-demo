package com.wmq.consumer.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:39:00
 * @Description: TODO
 */
@Data
public class User {

    private Long id;

    private String userName; // 用户名

    private String password; // 密码

    private String name;// 姓名

    private Integer age;// 年龄

    private Integer sex;// 性别，1男性，2女性

    private Date birthday;// 出生日期

    private Date created;// 创建时间

    private Date updated;// 更新时间

    private String note;// 备注
}
