package lab6;

import java.util.LinkedList;
import java.util.Queue;

public class Receptionist {

	public static void main(String[] args) {
		
		
		Queue<Items> items=  new LinkedList<Items>();
		
		Items i1 = new Items("LBB", 5.59);
		Items i2 = new Items("LTL CAJ", 2.79);
		Items i3 = new Items("{{{{ BACON }}}}", 0.0);
		Items i4 = new Items("LETTUS", 0.0);
		Items i5 = new Items("TOMATO", 0.0);
		Items i6 = new Items("->|G ONION", 0.0);
		Items i7 = new Items("->|JALA Grilled", 0.0);
		i1.addChild(i3);
		i1.addChild(i4);
		i1.addChild(i5);
		i1.addChild(i6);
		i1.addChild(i7);
		
		items.add(i1);
		items.add(i2);
		System.out.println("====================================================\n");
		System.out.println("Customer's Receipt");
		System.out.println("====================================================\n");
		ContextStrategy contextStrategy = new ContextStrategy(new CustomerReceipt());
		contextStrategy.print(items);
		System.out.println("====================================================\n");
		System.out.println("Packing Slip");
		contextStrategy = new ContextStrategy(new PackingSlip());
		System.out.println("====================================================\n");
		contextStrategy.print(items);
		System.out.println("====================================================\n");
		
	}
}
