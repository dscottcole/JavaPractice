package GeoPackage;

public class Rectangle {
	private int length;
	private int breadth;
	
	public void setLength(int l) {
		this.length = l;
	}
	
	public void setBreadth(int b) {
		this.breadth = b;
	}
	
	public int getLength() {
		System.out.println(length);
		return length;
	}
	
	public void calculatePerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter: " + perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle johnny = new Rectangle();
		johnny.setLength(5);
		johnny.setBreadth(3);
		johnny.length = 7;
		System.out.println("Length: " + johnny.length);
		System.out.println("Breadth: " + johnny.breadth);
	}

}
