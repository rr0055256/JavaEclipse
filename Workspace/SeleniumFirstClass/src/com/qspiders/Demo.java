package com.qspiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver f = new FirefoxDriver();
		f.get("file:///home/raman/Desktop/sample.html");
		f.close();
		

	}

}
