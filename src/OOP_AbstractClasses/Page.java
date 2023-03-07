package OOP_AbstractClasses;

public abstract class Page implements Web{
	
	//2 + 2 
	//0% abstraction: no abstract methods
	//x% abstraction: partial abstraction
	//100% abstraction: all abstract methods
	
	//can not create the Object of abstract class
	//but we can create the constructor of the abstract class
	//and it will be called when we create the object of child class
	
	public Page() {
		System.out.println("Page -- cosnt...");
	}
	
	public Page(int i) {
		System.out.println("Page -- cosnt..." + i);
	}
	
	public abstract void title();
	public abstract void title(int i);
	
	
	public abstract void url();

	public final void diplayLogo() {
		System.out.println("Page -- logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("Page loading time 10 secs");
	}
	
	public static void pageCycle() {
		System.out.println("Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("Page -- privacyPolicy");
	}
	
	
}
