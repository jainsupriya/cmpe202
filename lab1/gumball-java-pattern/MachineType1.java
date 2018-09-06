public class MachineType1 extends GumballMachine {
    
    public MachineType1(int numberGumballs) {
        super(numberGumballs);
        requiredMoney = 25;
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
            System.out.println("Please insert " + (requiredMoney-totalCoinValue) + " cents more");
    }

}
