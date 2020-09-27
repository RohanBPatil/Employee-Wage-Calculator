package empWageCalculator;

public class empWageCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		//constants
				int is_part_time = 1;
				int is_full_time = 2;
				int emp_wage_per_hr = 20;
				int working_days = 20;
				int max_hrs_in_month = 100;
				//variables
				int empHrs = 0;
				int total_empWage = 0;
				int total_empHrs = 0;
				int total_working_days = 0;
				//computation
				while(total_empHrs <= max_hrs_in_month && total_working_days < working_days) {
					total_working_days++;
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;
					
					switch(empCheck) {
					case 1:
						empHrs = 8;
						break;
					case 2:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
						break;
					}
					total_empHrs += empHrs;
					System.out.println("Day : "+total_working_days+" Emp Hrs : "+empHrs );
				}
				total_empWage = total_empHrs * emp_wage_per_hr;
				System.out.println("Total Employee Wage : "+total_empWage);
				
	}
}
