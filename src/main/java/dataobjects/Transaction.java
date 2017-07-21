package dataobjects;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

@ApiModel(value = "Transaction", description = "Transaction Data with account number, owner date and confirmation number")
public class Transaction {
	String accountNumber;
	BigDecimal transactionAmount;
	String acctOwnerName;
	String confirmationNumber;
	Date transactionDate;

	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", transactionAmount=" + transactionAmount
				+ ", acctOwnerName=" + acctOwnerName + ", confirmationNumber=" + confirmationNumber
				+ ", transactionDate=" + transactionDate + "]";
	}

	public Transaction(String accountNumber, BigDecimal transactionAmount, String acctOwnerName,
			String confirmationNumber, Date transactionDate) {
		super();
		this.accountNumber = accountNumber;
		this.transactionAmount = transactionAmount;
		this.acctOwnerName = acctOwnerName;
		this.confirmationNumber = confirmationNumber;
		this.transactionDate = transactionDate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getAcctOwnerName() {
		return acctOwnerName;
	}

	public void setAcctOwnerName(String acctOwnerName) {
		this.acctOwnerName = acctOwnerName;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
