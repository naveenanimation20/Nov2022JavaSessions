package OOP_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.diplayLogo();
		lp.pageLoadingTime();
		lp.resetPwd();
		
		Page.pageCycle();
		LoginPage.pageCycle();
		
		lp.privacyPolicy();
		
		//top casting:
		//child class object can be referred by abstract parent class ref variable:
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.diplayLogo();
		pg.pageLoadingTime();
		pg.privacyPolicy();

		//down casting? - NA
		
	}

}
