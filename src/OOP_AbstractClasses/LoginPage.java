package OOP_AbstractClasses;


public class LoginPage extends Page {

	
	public LoginPage() {
		System.out.println("LP -- const...");
	}
	
	public LoginPage(int i) {
		System.out.println("LP -- const..." + i);
	}
	
	@Override
	public void title() {
		System.out.println("LP - title");
	}
	
	@Override
	public void title(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void url() {
		System.out.println("LP - url");
	}

	public void resetPwd() {
		System.out.println("LP - reset PWD");
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Login Page loading time 5 secs");
	}

	public static void pageCycle() {
		System.out.println("Login Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("Login Page -- privacyPolicy");
		int x = 10;
		assert x>20 : "FAIL";
	}

	
	
}
