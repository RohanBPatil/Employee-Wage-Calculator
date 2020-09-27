package empWageCalculator;

public class empWageCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		//constants
				int is_full_time = 1;
				int emp_wage_per_hr = 20;
				//variables
				int empHrs = 0;
				int empWage = 0;
				double empCheck = Math.floor(Math.random() * 10) % 2;
				
				if (empCheck == is_full_time) {
					System.out.println("Employee is present");
					empHrs = 8;
				}
				else {
					System.out.println("Employee is absent");
					empHrs = 0;
				}
				
				//computation
				empWage = emp_wage_per_hr * empHrs;
				System.out.println("Employee Wage : "+empWage);
				
	}
}
