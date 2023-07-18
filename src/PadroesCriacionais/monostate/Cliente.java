package PadroesCriacionais.monostate;

import PadroesCriacionais.singleton.conn.Connection;
import PadroesCriacionais.singleton.conn.ConnectionPool;

public class Cliente {

	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}
}