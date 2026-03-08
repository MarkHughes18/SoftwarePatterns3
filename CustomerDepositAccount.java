import java.util.ArrayList;

public class CustomerDepositAccount extends CustomerAccount {
	private double interestRate;

	public CustomerDepositAccount() {
		super();
		this.interestRate = 0;
	}

	public CustomerDepositAccount(double interestRate, String number, double balance,
			ArrayList<AccountTransaction> transactionList) {
		super(number, balance, transactionList);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void applyBankCharge() {
		setBalance(getBalance() - 25);
	}

	@Override
	public void applyInterest(double rate) {
		setBalance(getBalance() + getBalance() * (rate / 100));
	}

}