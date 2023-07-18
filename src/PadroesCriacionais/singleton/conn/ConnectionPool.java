package PadroesCriacionais.singleton.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	//nao pode ser modificado(final)
	//estamos chamando dentro da propria classe
	private static final ConnectionPool singleton = new ConnectionPool();
	
	public final static int POOL_SIZE = 2;
	
	private List<Connection> connectionsPool;
	
	//a partir do getInstance podemos acessar os outros métodos
	public static ConnectionPool getInstance() {
		return singleton;
	}
	
	
	//Construtor privado, só pode ser acessado dentro dessa classe
	private ConnectionPool() {
		System.out.println("Criando Connection Pool");
		connectionsPool = new ArrayList<Connection>();
		for(int i = 0; i < POOL_SIZE; i++ ) {
			connectionsPool.add(new Connection());
		}
		
	}
			
		public Connection getConnection() {
			Connection avaiable = null;
			for(Connection conn: connectionsPool) {
				if(!conn.isInUse()) {
					avaiable = conn;
					break;
				}
		}
		if(avaiable == null) {
			System.out.println("Sem Conexões Disponiveis!");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
	
	
	
	
	
	
}
