package empWageCalculator;
import java.util.*;

public class EmpWageBuilder implements InterfaceToCalculateWage{
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	private List<CompanyEmpWage> companyEmpWageList;																		//creating list	
	
	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();																//initiating list
	}
	
	public void addCompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		companyEmpWageList.add(new CompanyEmpWage(company, emp_wage_per_hr, max_working_days, max_hrs_in_month));			//creating CompanyEmpWage obj and adding it to list
	}
	
	public void computeEmpWage() {																							//calling method to calculate wage and print
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			companyEmpWageList.get(i).setTotalEmpWage(calculateEmpWage(companyEmpWageList.get(i)));
			System.out.println(companyEmpWageList.get(i));
		}
	}
	//Method to calculate employee wage
	private int calculateEmpWage(CompanyEmpWage com) {
		//variables
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		int total_empWage = 0;
		List<Integer> dailyWages = new ArrayList<Integer>();
		
		//computation
		while(total_empHrs <= com.max_hrs_in_month && total_working_days < com.max_working_days) {
			total_working_days++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case is_part_time:
				empHrs = 8;
				break;
			case is_full_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			total_empHrs += empHrs;
			System.out.println("Day : "+total_working_days+" Emp Hrs : "+empHrs );
			dailyWages.add(empHrs * com.emp_wage_per_hr);
		}
		
		/*
		if(total_empHrs >= max_hrs_in_month)
			total_empHrs = max_hrs_in_month;															//if total hrs exceeds max hrs per month then computing for max hrs per month
		*/
		com.setDailyEmpWage(dailyWages);
		total_empWage = total_empHrs * com.emp_wage_per_hr;
		return total_empWage;
	}
	
	public int getTotalWage(String companyName) {
		int totWage = 0;
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			if(companyEmpWageList.get(i).company.equalsIgnoreCase(companyName)) {
				totWage = companyEmpWageList.get(i).total_empWage;
			}
		}
		return totWage;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator\n");
		
		InterfaceToCalculateWage ewb = new EmpWageBuilder();
		ewb.addCompanyEmpWage("DMart", 20, 2, 10);
		ewb.addCompanyEmpWage("Reliance", 10, 4, 20);
		ewb.computeEmpWage();
		System.out.println("\nTotal wage for DMart company is "+ewb.getTotalWage("DMart"));
		
	}
}
