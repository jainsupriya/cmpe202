package inputmask;

public class CCDateDecorator implements ICreditCardDecorator, IDisplayComponent {

	private String slash;
	
	
	public CCDateDecorator() {
		slash= "/";
	}

	@Override
	public String display() {
		return slash;
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
	}

	@Override
	public String decorate(String cardDate) {
		StringBuilder cDate = new StringBuilder();
		for(int i =0 ; i < cardDate.length();i++)
		{
			if(i==2)
				cDate.append(slash+ cardDate.charAt(i));
			else
				cDate.append( cardDate.charAt(i));
				
		}
		return cDate.toString();
	}

	
}
