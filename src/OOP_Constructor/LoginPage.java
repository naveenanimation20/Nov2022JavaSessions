package OOP_Constructor;

public class LoginPage {

	String userName;
	String password;

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public boolean doLogin() {
		System.out.println("enter username : " + userName);
		System.out.println("enter password : " + password);
		System.out.println("click on Login button");
		System.out.println("user is logged in");
		return true;
	}
	
	
	public void resetPwd() {
		System.out.println("reset pwd : " + password);
	}
	
	
	
	
	

}

