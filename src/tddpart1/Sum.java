package tddpart1;

public class Sum implements Expression {

	public Expression augend;
	public Expression addend;

	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount
				+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	@Override
	public Expression add(Expression addend) {
		// TODO Auto-generated method stub
		return null;
	}
}
