package restaurantQuetzal;

import org.junit.Assert;
import org.junit.Test;

import com.uacm.model.Empleados;

public class empleadosTEST {
	@Test
	public void test1() {
		Empleados emp = new Empleados();
		empleadosPU epu = new empleadosPU();
		final Empleados resultado = epu.validacionempleados(null, null);
		Assert.assertNotNull(resultado);
	}

}
