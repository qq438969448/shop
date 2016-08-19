/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * muyu@yiji.com 2016-08-19 14:45 创建
 *
 */
package com.vito16.shop.test.jpa;

import com.vito16.shop.dao.UserDao;
import com.vito16.shop.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/08/19
 */
public class UserJpaTest extends BaseJpaTest {
    @Autowired
    UserDao userDao;

    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("name");
        user.setPassword("123123");
        user = userDao.save(user);
        assertThat(user.getId()).isNotNull();
    }
}
