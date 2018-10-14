package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class PackingSlip implements ReceiptStrategy{

	@Override
	public void printReceipt(Queue<Items> items) {
		Items poppeditem;
		List<Items>list;
		for(int i =0; i<=items.size();i++)
		{
			list = new ArrayList<Items>();
			poppeditem = items.poll();
			System.out.println(poppeditem.getDescription());		
			for(Items items2 : poppeditem.getChild()) 
			{
				list.add(items2); 
			}
			if(list.size()>0)
			{
				Collections.sort(list, Comparator.comparing(Items::getDescription));
			      for(int k = 0; k < list.size(); k++)
			    	  System.out.println( list.get(k).toString() + "\n");
			}
		
		}		
	}
}