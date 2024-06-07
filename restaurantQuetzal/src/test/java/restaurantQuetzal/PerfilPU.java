package restaurantQuetzal;

import java.util.HashMap;

import com.uacm.model.Perfil;

public class PerfilPU {
	
	private final HashMap<Long,Perfil> perfilHashMap = new HashMap<>();
	
	public Perfil validacionPerfil(Long id, String perfil) {
		Perfil nuevoPerfil = new Perfil();
		perfilHashMap.put(id, nuevoPerfil);
		return nuevoPerfil;
		
	}
}	


