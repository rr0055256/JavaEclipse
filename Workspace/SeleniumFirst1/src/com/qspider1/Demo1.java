package com.qspider1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver f = new FirefoxDriver();
		f.get("file:///home/raman/Desktop/sample.html");
		f.close();
			}

}
