/*
 * @project :Weilinju
 * @auther  :huqiming 
 * @date    :2013-9-7
 */
package com.weilinju.core.api.params;

import java.util.List;

import com.weilinju.core.api.result.TestResult;

/**
 *
 */
public class TestParam {
	private String id;
	private long time;
	private List<TestResult> data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public List<TestResult> getData() {
		return data;
	}

	public void setData(List<TestResult> data) {
		this.data = data;
	}
}
