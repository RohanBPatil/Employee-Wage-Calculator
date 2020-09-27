package empWageCalculator;

public class empWageCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		int is_full_time = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == is_full_time)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
