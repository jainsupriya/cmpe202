
/**
 * Write a description of class MachineType1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MachineType1 implements GumballMachineTypes
{

    private int num_gumballs;
    private boolean has_quarter;
    private int accepts_value;

    public MachineType1( int size )
    {
        accepts_value = 25;
    	System.out.println("This Gumball Machine costs " +  accepts_value +" cents");
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }
    @Override
    public void insertCoin(int coin) {
    	// TODO Auto-generated method stub
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    	
    }

    @Override
    public void turnCrank() {
    	// TODO Auto-generated method stub
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    			System.out.println(num_gumballs + " Gumballs remaining" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}  
    	
    }
    
}
