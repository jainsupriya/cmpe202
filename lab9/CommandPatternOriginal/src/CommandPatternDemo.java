
public class CommandPatternDemo {

	public static void main(String args[]) {
		Stock stock = new Stock(10, "Apple");
		Broker bro = new Broker();
		
		BuyOrder buystk= new BuyOrder(stock);
		SellOrder sellstk= new SellOrder(stock);
		
		bro.giveOrder(buystk);
		bro.giveOrder(sellstk);
		bro.sendOrder();
		
	}
}
