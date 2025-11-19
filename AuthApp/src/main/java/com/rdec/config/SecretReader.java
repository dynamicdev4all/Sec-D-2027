package com.rdec.config;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class SecretReader {
	
	static Locale getLocale(String lang, String country) {
//		Locale locale = new Locale(lang, country);
		Locale locale = Locale.of(lang, country);
		return locale;
	}
	
	public static String readSecrets(String key, String lang, String country) {
		ResourceBundle rb = ResourceBundle.getBundle("appSecrets", getLocale(lang, country));
		return rb.getString(key);
	}
	
	static String getDateTime(int style) {
		Date date =  new Date();
		DateFormat dtf = DateFormat.getDateInstance(style, getLocale("ur", "PK"));
		return dtf.format(date);
	}
	
	
	
	public static String ERROR_LOG(String msg) {
		String color = "\u001B[32m";
		return color + getDateTime(0) + " TYPE : ERROR " + msg;
	}
	
	public static String INFO_LOG(String msg) {
		String color = "\u001B[33m";
		return color + getDateTime(0) + " TYPE : ERROR " + msg;
	}

	static void SUCCESS_LOG() {
	
	}
	
	
	public static void main(String a[]) {
		System.out.println(ERROR_LOG("DATA SAVE FAILED"));
	}
}
