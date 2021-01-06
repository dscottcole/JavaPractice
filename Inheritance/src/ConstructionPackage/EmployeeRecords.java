package ConstructionPackage;

public class EmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe = new PermanentEmployee();
		pe.setName("Anil");
		pe.setEmpId(101);
		pe.setBasicPay(10000);
		pe.setHra(1500);
		pe.setExperience(3);
		
		ContractEmployee ce = new ContractEmployee();
		ce.setName("Ankit");
		ce.setEmpId(102);
		ce.setWages(500);
		ce.setHours(10);
		
		pe.calculateSalary();
		ce.calculateSalary();
	}

}
