/**
 * 
 */
/**
 * 
 */
import com.apolyon.user.UserDatabaseAuthentication;

module com.apolyon.user.app {
//	Importar las exportaciones de otro modulo (Poriyecto)
	requires com.apolyon.user.db;
	
//	Servicio que vamoa a usar
	uses UserDatabaseAuthentication;
}