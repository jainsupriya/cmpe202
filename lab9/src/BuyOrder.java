
public class BuyOrder implements Order{

	Stock stc;
	
	public BuyOrder(Stock stc) {
		this.stc = stc;
	}


	@Override
	public void execute() {
		stc.buyOrder();
	}

}
