
public class Mockstocks implements Stocks {

	@Override
	public void buyOrder() {
		System.out.println("buyorder");

	}

	@Override
	public void sellOrder() {
		System.out.println("sellorder");

	}

}
