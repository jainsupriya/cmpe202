
public class Stock {
	private int quantity;
	private String name;
	
	
	public Stock(int quantity, String name) {
		this.quantity = quantity;
		this.name = name;
	}
	public void buyOrder()
	{
		System.out.println(quantity+ " stocks bought of " + name);
	}
	public void sellOrder()
	{
		System.out.println(quantity+ " stocks sold of " + name );
	}


}
