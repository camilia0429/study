package Ex5_Pen;

public class Pen {
	
	int price;
	String brand = "monami";
	String color;
	
	public Pen() {
		price = 1000;
		brand = "monami";
		color = "white";
	}
	
	public Pen(int price,String color) {
		this.price = price;
		this.color = color;
	}

}
