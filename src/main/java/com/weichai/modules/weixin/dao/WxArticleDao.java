/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.weichai.modules.weixin.dao;

import com.weichai.common.persistence.CrudDao;
import com.weichai.common.persistence.annotation.MyBatisDao;
import com.weichai.modules.weixin.entity.WxArticle;

/**
 * 微信文章管理DAO接口
 * @author wwhui
 * @version 2016-03-28
 */
@MyBatisDao
public interface WxArticleDao extends CrudDao<WxArticle> {
	
}