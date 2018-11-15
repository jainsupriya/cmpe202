
public class LambdaPatternDemo {

	public static void main(String args[]) {
		Stock stock = new Stock(10, "Apple");
		Broker bro = new Broker();
		
		bro.giveOrder(() -> stock.buyOrder());
		bro.giveOrder(()-> stock.sellOrder());
		bro.sendOrder();
		
		
		bro.giveOrder(stock::buyOrder);
		bro.giveOrder(stock::sellOrder);
		bro.sendOrder();
	}
}
