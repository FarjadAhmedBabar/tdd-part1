package tddpart1;

public interface Expression {
	public Money reduce(Bank bank, String to);

	public Expression add(Expression addend);

	public Expression times(int multiplier);
}
