package com.web.app.tests.config;

import com.google.gson.annotations.SerializedName;

public class Config{

	@SerializedName("application_url")
	private String applicationUrl;

	public String getApplicationUrl(){
		return applicationUrl;
	}
}