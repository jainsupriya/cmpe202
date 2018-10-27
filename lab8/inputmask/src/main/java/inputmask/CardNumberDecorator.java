package inputmask;

public class CardNumberDecorator implements ICreditCardDecorator, IDisplayComponent {

	private String space;
	
	
	public CardNumberDecorator() {
		space= " ";
	}

	@Override
	public String display() {
		return space;
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
	}

	@Override
	public String decorate(String cardNumber) {
		StringBuilder cNumber = new StringBuilder();
		for(int i =0 ; i < cardNumber.length();i++)
		{
			if(i == 4 || i == 8 || i == 12)
				cNumber.append(space+ cardNumber.charAt(i));
			else
				cNumber.append( cardNumber.charAt(i));
				
		}
		return cNumber.toString();
	}

	
}
