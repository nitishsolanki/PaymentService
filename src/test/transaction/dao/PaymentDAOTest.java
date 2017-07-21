import dao.PaymentDAO;

public class PaymentDAOTest {
	@Test
	public void getTransactionByID(String paymentID) {
		PaymentDAO paymentdao = new PaymentDAO();
		Transaction txn = paymentdao.getPaymentByID("12354");
	}
}
