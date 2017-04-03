package com.example.zhouwei.service.impl;

import com.example.zhouwei.User;
import com.example.zhouwei.mapper.TestMapper;
import com.example.zhouwei.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouwei on 2017/4/3.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public List<User> findAll() {
        return testMapper.findAll();
    }
}
