

public class Main {

	public static void main(String[] args) {
		
		//for machine type 1
		GumballMachine gumballMachine = new GumballMachine(new MachineType1(5));
		System.out.println(gumballMachine);
		gumballMachine.insertOperation( 25 );
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();

		//for machine type 2
		gumballMachine = new GumballMachine(new MachineType2(5));
		System.out.println(gumballMachine);
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 25 );
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		
		
		//for machine type 3
		gumballMachine = new GumballMachine(new MachineType3(5));
		System.out.println(gumballMachine);
		gumballMachine.insertOperation( 25 );
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 10 );
		gumballMachine.insertOperation( 5 );
		gumballMachine.insertOperation( 1);
		gumballMachine.insertOperation( 1);
		gumballMachine.insertOperation( 1);
		gumballMachine.insertOperation( 1);
		gumballMachine.insertOperation( 1);
		gumballMachine.turnCrankOperation();
		gumballMachine.insertOperation( 5);
		gumballMachine.turnCrankOperation();
		
	}
}
