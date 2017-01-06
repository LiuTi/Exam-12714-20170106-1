package com.hand.bean;
/**
 * 
 * @author violet
 *
 * @param <T>
 */
public class Page<T> {
	private int page;//当前页
	private int pageSize;//每页记录条数
	private T entity;
	public int getPage() {
		return page;
	}
	public Page setPage(int page) {
		this.page = page;
		 return this;
	}
	public int getPageSize() {
		return pageSize;
	}
	public Page setPageSize(int pageSize) {
		this.pageSize = pageSize;
		 return this;
	}
	public T getEntity() {
		return entity;
	}
	public Page setEntity(T entity) {
		this.entity = entity;
		 return this;
	}
	public int getOffset(){return (page - 1) * pageSize;}
	
	
}
