package lab6;

import java.util.ArrayList;
import java.util.List;

public class Items{
	
	private String description;
	private Double price ;
	private List<Items> subitems;
	
	public void addChild(Items i) {
		// TODO Auto-generated method stub
		subitems.add(i);
		
	}

	public void removeChild(Items i) {
		// TODO Auto-generated method stub
		subitems.remove(i);
	}

	public List<Items> getChild() {
		// TODO Auto-generated method stub
		return subitems;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Items(String description, Double price) {
		this.description = description;
		this.price = price;
		subitems = new ArrayList<Items>();
	}
	
	

	
	
}
