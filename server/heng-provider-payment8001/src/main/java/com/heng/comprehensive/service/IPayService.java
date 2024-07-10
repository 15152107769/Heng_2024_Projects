package com.heng.comprehensive.service;

import com.heng.comprehensive.entities.Pay;

import java.util.List;

public interface IPayService {
    Integer add(Pay pay);

    Integer delete(Integer id);

    Integer update(Pay pay);

    Pay getById(Integer id);

    List<Pay> getAll();
}
