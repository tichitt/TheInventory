import java.util.ArrayList;

public class Inventory{

	ArrayList<Product> products = new ArrayList<Product>();

	public Product addProduct(Product p){
		products.add(p);
		return p;
	}

	public Product findProduct(String name){
		for(int i = 0; i < products.size(); i++){
			if(name.equals(products.get(i).getName())){
				return products.get(i);
			}
		}
		return null;
	}

	public int totalStock(){
		int total = 0;

		for(int i = 0; i < products.size(); i++){
			total += products.get(i).getQuantity();
		}
		return total;
	}
}