package tddpart1;

public class Money implements Expression {
	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	String currency() {
		return currency;
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public String toString() {
		return amount + " " + currency;
	}

	public Expression add(Money addend) {
		return new Sum(this, addend);
	}
	@Override
	public Money reduce(String to) {
		return this;
	}
}
