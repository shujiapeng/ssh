package com.sjp.ssh.util;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Util {
	
	static ComboPooledDataSource dataSource;
	static QueryRunner runner;

	public static ComboPooledDataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new ComboPooledDataSource("mysql");
		}
		return dataSource;
	}
	
	public static QueryRunner getRunner() {
		if (runner == null) {
			runner = new QueryRunner(getDataSource());
		}
		return runner;
	}
}
