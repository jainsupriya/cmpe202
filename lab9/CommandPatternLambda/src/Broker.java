import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	List<Order> lOrders = new ArrayList<>();
	
	public void giveOrder(Order order) {
		lOrders.add(order);
	}
	
	public void sendOrder()
	{
		this.lOrders.forEach(Order::execute);
		lOrders.clear();
	}
}
