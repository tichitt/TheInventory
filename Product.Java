public class Product{

	private String name;
	private int quantity;

	Product(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}

	public String getName(){
		return name;
	}

	public int getQuantity(){
		return quantity;
	}
	
	public int addStock(int amount){
		quantity += amount;
		return quantity;
	}

	public int reduceStock(int amount){
		if (amount <= quantity){
			quantity -= amount;
		}
		else{
			quantity = 0;
		}
		return quantity;
	}

}