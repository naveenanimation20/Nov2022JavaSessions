package OOP_Encapsulation;

public class Testemp {

	public static void main(String[] args) {

		
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		
		
		e1.setSalary(12.33);
		System.out.println(e1.getSalary() + " " + e1.name + " " + e1.age);
		
		
		//POST
		Company c1 = new Company("IBM", 1000, 500);
				
		//GET
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());
		System.out.println(c1.getEmpCount());//1000
		
		//PUT
		c1.setEmpCount(2000);
		
		//GET
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());
		System.out.println(c1.getEmpCount());//2000
		
		
		
		//register:
		RegisterPage reg = new RegisterPage("Tom", 25, "Bangalore 566611", "01-01-1990");
		
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		System.out.println(reg.getAddress());

		
		reg.setAddress("Pune 456677");
		System.out.println(reg.getName());
		System.out.println(reg.getAddress());
		
		
		RegisterPage reg1 = new RegisterPage("Ravi", 30);
		reg1.setDob("02-02-1987");
		reg1.setAddress("Delhi");
		
		//
		Browser br = new Browser();
		br.launchBrowser();
		
	}

}
