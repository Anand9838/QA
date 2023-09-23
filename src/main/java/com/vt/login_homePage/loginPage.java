package com.vt.login_homePage;

import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.openqa.selenium.support.PageFactory;

import com.vt.generic_methods.generic_methods;

public class loginPage extends loginPageObject_Repository {


	public generic_methods util;

	public loginPage(generic_methods utl) {
		util=utl;
		PageFactory.initElements(util.driver, this);

	}
	public void validation_loginPage() {

		util.mySendkeys(inputdata, "admin", "user name");
	}


}
