package restaurantQuetzal;
import org.junit.Assert;
import org.junit.Test;

import com.uacm.model.Reservacion;


public class reservacionesTEST {
@Test 
public void test() {
	Reservacion r = new Reservacion();
	reservacionesPU rpu = new reservacionesPU();
	r.getCantidadPersonas();
	r.getCelebracion();
	r.getFecha();
	r.getFolio();
	r.getHora();
	r.getIdReservacion();
	r.getMeseroAsignado();
	r.getNombreResponsable();
	r.getNumMesa();
	final Reservacion resultado = rpu.validacionReservaciones(null, null);
	Assert.assertNotNull(resultado);
			
	
}
}
