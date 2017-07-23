package dataobjects;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Transaction", description = "Transaction description data")
public class Transaction implements Comparator<Transaction> {
	@ApiModelProperty(value = "accountNumber", dataType = "String", example = "5639265293", position = 1)
	String accountNumber;
	@ApiModelProperty(value = "Transaction Amount", dataType = "BigDecimal", example = "10.55", position = 2)
	BigDecimal transactionAmount;
	@ApiModelProperty(value = "Payment confirmation number", dataType = "String", position = 3)
	String paymentID;
	@ApiModelProperty(value = "Date of Transaction", dataType = "java.util.Date", position = 4)
	Date transactionDate;

	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", transactionAmount=" + transactionAmount
				+ ", paymentID=" + paymentID + ", transactionDate=" + transactionDate + "]";
	}

	public Transaction(String accountNumber, BigDecimal transactionAmount, String paymentID, Date transactionDate) {
		super();
		this.accountNumber = accountNumber;
		this.transactionAmount = transactionAmount;
		this.paymentID = paymentID;
		this.transactionDate = transactionDate;
		System.err.println("Nitish");
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public int compare(Transaction o1, Transaction o2) {
		if (o1.getPaymentID().equalsIgnoreCase(o1.getPaymentID()))
			return 0;
		else
			return -1;
	}
}
