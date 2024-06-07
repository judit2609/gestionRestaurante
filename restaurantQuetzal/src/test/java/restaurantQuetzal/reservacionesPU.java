package restaurantQuetzal;

import java.util.HashMap;

import com.uacm.model.Reservacion;

public class reservacionesPU {
	private final HashMap<Long,Reservacion> reservacion = new HashMap<>();
	
	public Reservacion validacionReservaciones(Long id, String reserva) {
		Reservacion nuevaReservacion = new Reservacion();
		reservacion.put(id, nuevaReservacion);
		return nuevaReservacion;
	}
}
