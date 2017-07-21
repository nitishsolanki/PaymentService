import org.junit.Test;

import dao.PaymentDAO;
import dataobjects.Transaction;

public class PaymentDAOTest {
	@Test
	public void getTransactionByID(String paymentID) {
		PaymentDAO paymentdao = new PaymentDAO();
		Transaction txn = paymentdao.getPaymentByID("12354");
	}
}
