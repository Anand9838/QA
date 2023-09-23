package com.textcase;

import com.vt.generic_methods.generic_methods;
import com.vt.login_homePage.loginPage;

public class Runner_class {


 	public static void main(String[] args) {
		generic_methods kk= new generic_methods();
		kk.launchBrowser("chrome");
		kk.openUrl("http://localhost:8888/");
		
		loginPage  run=  new loginPage(kk);
		run.validation_loginPage();
		
	}



}
