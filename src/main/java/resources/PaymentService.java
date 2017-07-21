package resources;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.PaymentDAO;

public class PaymentService {
	PaymentDAO paymentDAO = null;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPaymentByID(@PathParam("paymentID") String paymentID) {
		paymentDAO = new PaymentDAO();
		return Response.ok(paymentDAO.getPaymentByID(paymentID)).build();
	}

}
