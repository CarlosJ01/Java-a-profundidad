/**
 * 
 */
/**
 * 
 */

import com.apolyon.user.UserDatabaseAuthentication;
import com.apolyon.user.db.oracle.OracleAuthenticator;

module  com.apolyon.user.db.oracle {
	requires com.apolyon.user.db;
//	Declarrar provedores con la implemnentacion de un servicio
	provides UserDatabaseAuthentication with OracleAuthenticator;
}