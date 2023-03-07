package OOP_Interface;

public interface USMedical extends WHO, USHG {
	
	int min_fee = 10;
	//vars : static and final by default

	// in Interface:
	// can not have the methods body -- abstract methods
	// only method declaration - no buss logic
	// only method prototype

	// can not create the Object of Interface
	// can not have const... of the interface
	
	//abstract methods:
	//final - NA
	//static - NA
	//private - NA
	
	//jdk 1.7: 100% abstraction
	//jdk 1.8: default non static methods: ~100%
	//0% abstraction

	public void cardioServices();
	
	public void neuroServices();

	public void physioServices();

	public void emergencyServices();

	@Override
	public void covidVaccination();

	// main()???
	
	
	//After JDK 1.8:
	//1. static method with the method body:
	
	public static void taxCalculation() {
		System.out.println("US - taxCalculation");
	}
	
	
	//2. default methods: not static:
	default void getMedicalServices() {
		System.out.println("US - getMedicalServices");
	}
	
	

}
