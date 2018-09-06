public class MachineType2 extends GumballMachine {
    
    public MachineType2(int numberGumballs) {
        super(numberGumballs);
        requiredMoney = 50;
        totalCoinValue = 0;
    // TODO Auto-generated constructor stub
    }
     
    public void insertQuarter(int coin) {
        coinInserted = coin;
        if (coinInserted == 25)
            totalCoinValue = totalCoinValue+coinInserted;
        
        if(totalCoinValue >= requiredMoney)
        {
            state.insertQuarter();
            totalCoinValue= totalCoinValue - requiredMoney;
        }
        else
        {
            System.out.println("You have inserted " + totalCoinValue + " cents");
            System.out.println("Please insert " + (requiredMoney-totalCoinValue) + " cents more");
        }
    }

}
