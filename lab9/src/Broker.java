import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	List<Order> lOrders = new ArrayList<>();
	
	public void giveOrder(Order order) {
		lOrders.add(order);
	}
	
	public void sendOrder()
	{
		for(Order order:lOrders)
		{
			order.execute();
		}
		lOrders.clear();

	}
}
