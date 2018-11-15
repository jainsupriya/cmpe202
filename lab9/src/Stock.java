
public class Stock {
	private int quantity;
	private String name;
	
	
	public Stock(int quantity, String name) {
		this.quantity = quantity;
		this.name = name;
	}
	public void buyOrder()
	{
		System.out.println(quantity+ " bought of " + name + " stock");
	}
	public void sellOrder()
	{
		System.out.println(quantity+ " sold of " + name + " stock");
	}

}
