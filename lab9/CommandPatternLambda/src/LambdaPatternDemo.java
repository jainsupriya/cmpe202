
public final class LambdaPatternDemo {

	public static void main(final String args[]) {
		final Stocks stock = new Mockstocks();
		Broker bro = new Broker();
		
		System.out.println("1st way of doing \n");
		//1st way
		bro.giveOrder(() -> stock.buyOrder());
		bro.giveOrder(()-> stock.sellOrder());
		bro.sendOrder();
		
		System.out.println("--------------------");
		System.out.println("2nd way of doing \n");
		//2nd way
		bro.giveOrder(stock::buyOrder);
		bro.giveOrder(stock::sellOrder);
		bro.sendOrder();

	}
}
