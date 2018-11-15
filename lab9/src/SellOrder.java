
public class SellOrder implements Order {

	Stock stc;
	public SellOrder(Stock stc) {
		this.stc = stc;
	}

	@Override
	public void execute() {
		stc.sellOrder();
	}

}
