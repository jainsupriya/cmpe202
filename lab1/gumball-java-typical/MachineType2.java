public class MachineType2 implements GumballMachineTypes{
    private int num_gumballs;
    private boolean has_quarter;
    private int total_coin_value ;
    private int required_value;
   
    public MachineType2( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        required_value = 50;
        total_coin_value = 0;
        System.out.println("This Gumball Machine costs " +  required_value +" cents");
        
    }
    @Override
    public void insertCoin(int coin) 
    {   // TODO Auto-generated method stub
        if ( coin == 25 )
        {
            this.has_quarter = true ;
            total_coin_value =  total_coin_value+coin;

        }       
        else 
            this.has_quarter = false ;
        
    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub
        if ( total_coin_value >= required_value )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                total_coin_value = total_coin_value-required_value;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "You have inserted " +  total_coin_value +" cents") ;
            System.out.println( "Please insert " + (required_value -total_coin_value)+ " cents more" ) ;
        }  
        
    }
    
}