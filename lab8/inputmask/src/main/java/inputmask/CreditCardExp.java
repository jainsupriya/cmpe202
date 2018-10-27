package inputmask;
/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	ICreditCardDecorator decorator = null;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    public void wrap(ICreditCardDecorator cardDecorator) {
    	decorator = cardDecorator;
    }

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else if(decorator == null)
				return "[" + date + "]" + "  " ;
		else
				return "[" + decorator.decorate(date) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
		{
			if(ch.toUpperCase().matches("X|DELETE") && date.length()>0)
				date = date.substring(0, date.length()-1);
			else
				date += ch ;
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	
	public void delete(int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
		{
			if(date.length()>0)
				date = date.substring(0, date.length()-1);
		}
	}	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}