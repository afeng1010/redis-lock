package com.mountain.service;

import com.mountain.model.Result;
import redis.clients.jedis.Client;

public interface testBussiness extends ISuperService<Client> {

    /**
     *@Describe 测试类
     *@Params
     *@Return
     *@Author  afeng1010
     *@Date  2019/11/28
     */
    Result saveClient(Client clientDto);
}
