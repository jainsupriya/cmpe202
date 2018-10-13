package lab6;
import java.util.Queue;

public class CustomerReceipt  implements ReceiptStrategy{

	@Override
	public void printReceipt(Queue<Items> items) {
		Items poppeditem;
		Double total =0.0;
		for(int i =0; i<=items.size();i++)
		{
			poppeditem = items.poll();
			total +=  poppeditem.getPrice();
			System.out.println(poppeditem.getDescription() + "				"+ poppeditem.getPrice());
			for(Items items2 : poppeditem.getChild()) 
				System.out.println(items2.getDescription());	       
		}
		System.out.println("Total :				"	+total );
	}

}
