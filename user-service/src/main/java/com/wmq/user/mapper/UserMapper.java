package com.wmq.user.mapper;

import com.wmq.user.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:18:00
 * @Description: TODO
 */
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") Long id);
}
