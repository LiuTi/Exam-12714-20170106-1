package com.hand.bean;

import java.util.List;


/**
 * 
 * @author violet
 *
 */
public class ResponseData<T> {
	private int total;//总条数
	private List<T> rows;//行数
	public int getTotal() {
		return total;
	}
	public ResponseData setTotal(int total) {
		this.total = total;
		return this;
	}
	public List<T> getRows() {
		return rows;
	}
	public ResponseData setRows(List<T> rows) {
		this.rows = rows;
		return this;
	}
	
}
