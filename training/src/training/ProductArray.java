package training;

public class ProductArray {

	int id;
	String name;
	double cost;

	ProductArray(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public static void main(String[] args) {
		double total = 0;
		ProductArray[] products = { new ProductArray(10, "Pen", 200), new ProductArray(10, "Pencil", 100),
				new ProductArray(10, "Eraser", 50) };
		for (ProductArray temp : products) {
			total = total + temp.getCost();
		}
		System.out.println("Total cost :::: " + total);

	}

}
