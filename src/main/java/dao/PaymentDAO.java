package dao;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import dataobjects.Transaction;

public class PaymentDAO {

	public static List<Transaction> payments = Arrays.asList(
			new Transaction("12345", new BigDecimal("100.10"), "abc123", new Date()),
			new Transaction("45672", new BigDecimal("10.20"), "def456", new Date()),
			new Transaction("873562", new BigDecimal("45.16"), "ghi873", new Date()),
			new Transaction("915233", new BigDecimal("32.33"), "jkl915", new Date()));

	public Transaction getPaymentByID(String paymentID) {
		Transaction lookupTransaction = new Transaction(null, null, paymentID, null);

		for (Transaction payment : payments) {
			if (payment.compare(payment, lookupTransaction) == 0) {
				return payment;
			}
		}
		return null;
	}
}
