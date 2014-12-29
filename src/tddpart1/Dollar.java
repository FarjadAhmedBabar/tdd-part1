package tddpart1;

public class Dollar 
{
	int amount;
	Dollar(int amount) 
	{
		this.amount= amount;
	}
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
		}
	public int getAmount() {
		return amount;
	}
}