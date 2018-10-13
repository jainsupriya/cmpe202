package lab6;

import java.util.List;
import java.util.Queue;

public interface ReceiptStrategy {
	void printReceipt(Queue<Items> items);
}
