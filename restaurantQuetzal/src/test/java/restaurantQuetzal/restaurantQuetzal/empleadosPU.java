package restaurantQuetzal;

import java.util.HashMap;

import com.uacm.model.Empleados;

public class empleadosPU {

	private final HashMap<Long, Empleados> empleados = new HashMap<>();

	public Empleados validacionempleados(Long id, String nombre) {
		Empleados nuevoEmpleado = new Empleados();
		empleados.put(id, nuevoEmpleado);
		return nuevoEmpleado;
	}
}
