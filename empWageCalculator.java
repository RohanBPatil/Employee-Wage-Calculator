package empWageCalculator;

public class empWageCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		//constants
				int is_part_time = 1;
				int is_full_time = 2;
				int emp_wage_per_hr = 20;
				//variables
				int empHrs = 0;
				int empWage = 0;
				double empCheck = Math.floor(Math.random() * 10) % 3;
				
				if (empCheck == is_full_time) {
					empHrs = 8;
				}
				else if (empCheck == is_part_time) {
					empHrs = 8;
				}
				else {
					empHrs = 0;
				}
				
				//computation
				empWage = emp_wage_per_hr * empHrs;
				System.out.println("Employee Wage : "+empWage);
	}
}
