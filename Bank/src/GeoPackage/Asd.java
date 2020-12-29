package GeoPackage;

public class Asd {
	  private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Asd myObj = new Asd();
	    myObj.name = "John";  // error
	    System.out.println(myObj.name); // error
		Rectangle johnny = new Rectangle();
		johnny.setLength(5);
		johnny.setBreadth(3);
//		johnny.length = 7;
//		System.out.println("Length: " + johnny.length);
//		System.out.println("Breadth: " + johnny.breadth);
		johnny.getLength();

	}

}
