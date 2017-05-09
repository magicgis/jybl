/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.weichai.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weichai.common.persistence.Page;
import com.weichai.common.service.CrudService;
import com.weichai.modules.sys.entity.Book;
import com.weichai.modules.sys.dao.BookDao;

/**
 * 书籍管理Service
 * @author 徐韵轩
 * @version 2017-05-08
 */
@Service
@Transactional(readOnly = true)
public class BookService extends CrudService<BookDao, Book> {

	public Book get(String id) {
		return super.get(id);
	}
	
	public List<Book> findList(Book book) {
		return super.findList(book);
	}
	
	public Page<Book> findPage(Page<Book> page, Book book) {
		return super.findPage(page, book);
	}
	
	@Transactional(readOnly = false)
	public void save(Book book) {
		super.save(book);
	}
	
	@Transactional(readOnly = false)
	public void delete(Book book) {
		super.delete(book);
	}
	
}