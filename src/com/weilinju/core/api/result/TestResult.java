/*
 * @project :Weilinju
 * @auther  :huqiming 
 * @date    :2013-9-7
 */
package com.weilinju.core.api.result;

import java.util.List;

/**
 *
 */
public class TestResult {
	private boolean isOk;
	private List<String> site;

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public List<String> getSite() {
		return site;
	}

	public void setSite(List<String> site) {
		this.site = site;
	}
}
