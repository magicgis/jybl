/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.wfu.modules.app.dao;

import com.wfu.common.persistence.CrudDao;
import com.wfu.common.persistence.annotation.MyBatisDao;
import com.wfu.modules.app.entity.BookUser;

/**
 * 管理员信息管理DAO接口
 * @author 徐韵轩
 * @version 2017-06-25
 */
@MyBatisDao
public interface BookUserDao extends CrudDao<BookUser> {
    public BookUser findBookUserByName(String username);


}