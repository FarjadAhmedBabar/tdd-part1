package tddpart1;

public interface Expression {
	Money reduce(Bank bank, String to);
	Expression add(Expression addend);
}
