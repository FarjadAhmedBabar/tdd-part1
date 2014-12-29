package tddpart1;

public class Dollar 
{
	private int amount;
	Dollar(int amount) 
	{
		this.amount= amount;
	}
	void times(int multiplier) {
		amount *= multiplier;
	}
}