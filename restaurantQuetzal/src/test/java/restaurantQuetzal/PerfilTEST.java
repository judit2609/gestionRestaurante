package restaurantQuetzal;

import org.junit.Assert;
import org.junit.Test;
import com.uacm.model.Perfil;

class PerfilTEST {

@Test
 void test() {
	Perfil p= new Perfil(); 
	PerfilPU pu = new PerfilPU();
	p.getIdPerfil();
	p.getPuesto();
	final Perfil resultado = pu.validacionPerfil(null, null);
	Assert.assertNotNull(resultado);
	
}
}
