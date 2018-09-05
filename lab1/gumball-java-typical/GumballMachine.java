
public class GumballMachine
{
	private GumballMachineTypes machineTypes;
	
	public GumballMachine(GumballMachineTypes gumballMachineTypes)
	{
		this.machineTypes = gumballMachineTypes;
	}
	public void insertOperation(int coin)
	{
		machineTypes.insertCoin( coin);
	}
	public void turnCrankOperation()
	{
		machineTypes.turnCrank();
	}
}

