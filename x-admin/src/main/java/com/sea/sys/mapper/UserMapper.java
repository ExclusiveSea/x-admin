package com.sea.sys.mapper;

import com.sea.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Sea
 * @since 2023-08-18
 */
public interface UserMapper extends BaseMapper<User> {
    public List<String> getRoleNameByUserId(Integer userId);
}
