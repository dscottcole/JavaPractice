package ArrayPackage;

public class EmployeeRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double sumSalary = 0;
		double avgSalary = 0;
		int overpaidEmp = 0;
		
//		for(int i = 0; i < salary.length; i++) {
//			sumSalary += salary[i];
//		}
//		
//		avgSalary = sumSalary/salary.length;
//		
//		for(int i = 0; i < salary.length; i++) {
//			if (salary[i] < avgSalary) {
//				overpaidEmp++;
//			}
//		}
		
		for (double d : salary) {
			sumSalary += d;
		}
		
		avgSalary = sumSalary/salary.length;
		
		for (double i : salary) {
			if (i > avgSalary) {
				overpaidEmp++;
			}
		}

		System.out.println(avgSalary);
		System.out.println("Employees paid higher than average: " + overpaidEmp);
		System.out.println("Employees paid lower than average: " + (salary.length - overpaidEmp));
		
	}

}
