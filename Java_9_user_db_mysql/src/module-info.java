/**
 * 
 */
/**
 * 
 */

import com.apolyon.user.UserDatabaseAuthentication;
import com.apolyon.user.db.mysql.MySQLAuthenticator;

module com.apolyon.user.db.mysql {
	requires com.apolyon.user.db;
//	Declarrar provedores con la implemnentacion de un servicio
	provides UserDatabaseAuthentication with MySQLAuthenticator;
}