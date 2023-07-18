package PadroesCriacionais.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	public final static int POOL_SIZE = 2;
	
	private static List<Connection> connectionsPool;
	
	static {
		System.out.println("Criando Connection Pool");
		connectionsPool = new ArrayList<Connection>();
		for(int i=0;i<POOL_SIZE;i++) {
			connectionsPool.add(new Connection());
		}
	}
	
	public ConnectionPool() {
		System.out.println("Nova Instancia de Connection Pool");
	}
	
	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		//nao usamos sysoprintln para logar coisas na aplicação.
		if(avaiable == null) {
			System.out.println("Sem conexões disponiveis");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
	
	
	
}
