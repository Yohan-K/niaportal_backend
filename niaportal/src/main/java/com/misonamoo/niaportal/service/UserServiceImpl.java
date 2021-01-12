package com.misonamoo.niaportal.service;

import com.misonamoo.niaportal.mapper.UserMapper;
import com.misonamoo.niaportal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User userVO) {
        return userMapper.login(userVO);
    }

    @Override
    public String findId(User vo) throws Exception {
        return userMapper.findId(vo);
    }

    @Override
    public int setPw(User vo) {
        return userMapper.setPw(vo);
    }
}
