package PadroesCriacionais.singleton;

import PadroesCriacionais.singleton.conn.Connection;
import PadroesCriacionais.singleton.conn.ConnectionPool;

public class Cliente {

	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	
	
}
