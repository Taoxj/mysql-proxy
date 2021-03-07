package com.xjt.proxy.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjt.proxy.domain.User;
import com.xjt.proxy.dynamicdatasource.DataSourceSelector;
import com.xjt.proxy.dynamicdatasource.DynamicDataSourceEnum;
import com.xjt.proxy.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

/**
 * @author kevin
 * @date 2019-11-20 10:16
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @DataSourceSelector(value = DynamicDataSourceEnum.MASTER)
    public int update(Long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("老薛");
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public User find(Long userId) {
        User user = new User();
        user.setUserId(userId);
        return userMapper.selectByPrimaryKey(user);
    }
}
