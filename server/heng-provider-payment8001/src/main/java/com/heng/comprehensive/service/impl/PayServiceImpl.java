package com.heng.comprehensive.service.impl;

import com.heng.comprehensive.entities.Pay;
import com.heng.comprehensive.mapper.PayMapper;
import com.heng.comprehensive.service.IPayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @FileName PayServiceImpl
 * @Description
 * @Author zhaoheng
 * @date 2024-07-10 00:27
 **/
@Service
public class PayServiceImpl implements IPayService {

    @Resource
    private PayMapper payMapper;


    @Override
    public Integer add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public Integer delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}