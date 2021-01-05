package ConfectionaryPackage;

public class Chocolate {
	private int barCode, weight, cost;
	private String name;
	
	Chocolate() {
		barCode = 101;
		name = "Cadbury";
		weight = 12;
		cost = 10;
	}
	
	int getBarCode() {
		return barCode;
	}
	
	void setBarCode(int cBarCode) {
		barCode = cBarCode;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String cName) {
		name = cName;
	}
	
	int getWeight() {
		return weight;
	}
	
	void setWeight(int cWeight) {
		weight = cWeight;
	}
	
	int getCost() {
		return cost;
	}
	
	void setCost(int cCost) {
		cost = cCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco = new Chocolate();
		System.out.println("----------------------");
		System.out.println(choco.getBarCode());
		System.out.println(choco.getName());
		System.out.println(choco.getWeight());
		System.out.println(choco.getCost());
		choco.setBarCode(102);
		choco.setName("Hershey's");
		choco.setWeight(24);
		choco.setCost(50);
		System.out.println("----------------------");
		System.out.println(choco.getBarCode());
		System.out.println(choco.getName());
		System.out.println(choco.getWeight());
		System.out.println(choco.getCost());
		System.out.println("----------------------");
		choco.name = "Twix";
		System.out.println(choco.name);
	}

}
