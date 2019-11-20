package com.xjt.proxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjt.proxy.domain.User;
import com.xjt.proxy.dynamicdatasource.DataSourceSelector;
import com.xjt.proxy.dynamicdatasource.DynamicDataSourceEnum;
import com.xjt.proxy.mapper.UserMapper;

/**
 * @author kevin
 * @date 2019-11-20 10:16
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @DataSourceSelector(value = DynamicDataSourceEnum.MASTER)
    public List<User> listUser() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public User update() {
        User user = new User();
        user.setUserId(Long.parseLong("1196978513958141953"));
        user.setUserName("修改后的名字1");
        if (userMapper.updateByPrimaryKeySelective(user) > 0) {
            return userMapper.selectByPrimaryKey(user);
        }
        return null;
    }
}
