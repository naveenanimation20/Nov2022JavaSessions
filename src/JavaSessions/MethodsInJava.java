package JavaSessions;


public class MethodsInJava {
	
	// data members:
	//1. class vars
	//2. class methods
	
	//function:
	//functions are independent
	//can not create a funct inside a function
	//2+2 = 4
	//3+2 = 5
	
	//1. no input and no return:
	//void: no return : function can not return anything
	//return type: void
	public void test() {
		System.out.println("test method");
		int a = 10;
		int h = 15;
		System.out.println(a+h);
	}
	
	//2. no input and some return:
	//return type: int
	public int getBillAmount() {
		System.out.println("get billing amount");
		int foodBills = 100;
		int drinksBills = 50;
		int totalAmount = foodBills + drinksBills;
		return totalAmount;
	}
	
	public String getEmployeeName() {
		System.out.println("get emp name");
		String name = "Naveen";
		return name;
	}
	
	public String getName() {
		System.out.println("get name");
		return "selenium";
	}
	
	public int getNumber() {
		return 100;
	}
	
	public boolean isElementExist() {
		System.out.println("check element is present");
		boolean flag = true;
		return flag;
	}
	
	public int getMarks() {
		int a = 100;
		int bonus = 5;
		int negative = 10;
		int finalMarks = a + bonus-negative;
		return finalMarks;
	}
	
	
	//3. some input and some return:
	//WAF: 
	//two variables: a and b
	//return sum of these two numbers:
	public int getSum(int a, int b) {
		System.out.println("sum of two numbers....");
		int sum = a+b;
		return sum;
	}
	
	//WAF:
	//input params: int, double
	//return multiplication of these two numbers
	public double getMultiplication(int x, double y) {
		System.out.println("getMultiplication");
		double mul = x * y;
		return mul;
	}
	
	public String getEmpSalaryInfo(String empName, int bonusAmount) {
		System.out.println("emp salary");
		
		return empName + ":"+ bonusAmount;
	}
	
	

	public static void main(String[] args) {

		//call the function: we have to create the object
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		int m1 = obj.getBillAmount();
		System.out.println(m1-10);
		
		System.out.println(obj.getBillAmount());
		
		String emp = obj.getEmployeeName();
		System.out.println(emp);
		
		if(obj.isElementExist()) {
			System.out.println("click on element");
		}
		
		int s1 = obj.getSum(10, 20);//call by value
		System.out.println(s1);
		
		int s2 = obj.getSum(40, 50);
		System.out.println(s2);
		
		double mul1 = obj.getMultiplication(10, 2.2);
		System.out.println(mul1);
		
		String empInfo = obj.getEmpSalaryInfo("Amit", 20);
		System.out.println(empInfo);
		
		String empInfo1 = obj.getEmpSalaryInfo("Naveen", 10);
		System.out.println(empInfo1);
		
		
		Student st1 = new Student();
		int m11 = st1.getStudentMarks("Neha");	
		
		
	}
	
	
	

}
