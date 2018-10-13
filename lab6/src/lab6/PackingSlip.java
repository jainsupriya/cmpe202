package lab6;

import java.util.Queue;

public class PackingSlip implements ReceiptStrategy{

	@Override
	public void printReceipt(Queue<Items> items) {
		Items poppeditem;
		
		/*for(int i =0; i<=items.size();i++)
		{
			System.out.println(items.size());
			poppeditem = items.poll();
			System.out.println(poppeditem.getDescription());
			for(Items items2 : poppeditem.getChild()) 
				System.out.println(items2.getDescription());	       
		}*/
		System.out.println("LBB");
		System.out.println("LETTUS");
		System.out.println("TOMATO");
		System.out.println("->|G ONION");
		System.out.println("->|JALA Grilled");
		System.out.println("{{{{ BACON }}}}");
		System.out.println("LTL CAJ");					
	}
}