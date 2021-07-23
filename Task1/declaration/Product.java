package Product.declaration;
import java.util.Comparator;

public class Product implements Comparable {

	
	public int id;
	public double price;
	public String name;
	public Product(int id, double price, String name) {
		
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Product p=(Product)o;
		if(this.getPrice()>p.getPrice())
			return 1;
		else if(this.getPrice()<p.getPrice())
			return -1;
		else
			return 0;
	}
}
	
	
	

