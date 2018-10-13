package lab6;

import java.util.List;
import java.util.Queue;

public class ContextStrategy {
	private ReceiptStrategy receiptStrategy;

	public ContextStrategy(ReceiptStrategy receiptStrategy) {
		this.receiptStrategy = receiptStrategy;
	}
	public void print(Queue<Items> items)
	{
		receiptStrategy.printReceipt(items);
	}

}
