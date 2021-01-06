package ThisConfectionaryPackage;

public class Chocolate {
	
	private int barCode, weight, cost;
	private String name;
	
	Chocolate(int barCode, String name, int weight, int cost) {
		this.barCode = barCode;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
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
		Chocolate choco = new Chocolate(101, "Cadbury", 12, 10);
		System.out.println("----------------------");
		System.out.println(choco.getBarCode());
		System.out.println(choco.getName());
		System.out.println(choco.getWeight());
		System.out.println(choco.getCost());
		choco.setBarCode(102);
		choco.setName("Hershey's");
		choco.setWeight(24);
		choco.setCost(50);
		System.out.println("--------------`--------");
		System.out.println(choco.getBarCode());
		System.out.println(choco.getName());
		System.out.println(choco.getWeight());
		System.out.println(choco.getCost());

	}

}
