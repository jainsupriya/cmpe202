

public class Main {

    public static void main(String[] args) {
        //machine type 1
        GumballMachine gumballmachine = new MachineType1(5);
        System.out.println(gumballmachine);
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        System.out.println(gumballmachine);
        
        //machine type 2
        gumballmachine = new MachineType2(5);
        System.out.println(gumballmachine);
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter(25);
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        System.out.println(gumballmachine);
        
        //machine type 3
        gumballmachine = new MachineType3(5);
        System.out.println(gumballmachine);
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter(10);
        gumballmachine.insertQuarter(5);
        gumballmachine.insertQuarter(1);
        gumballmachine.insertQuarter(1);
        gumballmachine.insertQuarter(1);
        gumballmachine.insertQuarter(1);
        gumballmachine.insertQuarter(1);
        gumballmachine.turnCrank();
        gumballmachine.insertQuarter(5);
        gumballmachine.turnCrank();
        System.out.println(gumballmachine);
        


    }
}
