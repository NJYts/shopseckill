package com.njy.springboot.shopseckill.mapper;

import com.njy.springboot.shopseckill.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * njy
 */
@Mapper
public interface UserMapper {

    @Select("select * from sk_user where id = #{id}")
    public User getById(@Param("id") long id);

    @Update("update sk_user set password = #{password} where id = #{id}")
    public void update(User toBeUpdate);
}
