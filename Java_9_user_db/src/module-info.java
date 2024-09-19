/**
 * 
 */
/**
 * 
 */

//Revese domain
module com.apolyon.user.db {
//	Paquetes a exportar, por default todos son ocultos
	exports com.apolyon.user;
	
//	exports no permite reflexion
//	exports com.apolyon.reflexion;
//	Como export pero permite acceso por reflexion
	opens com.apolyon.reflexion;
}