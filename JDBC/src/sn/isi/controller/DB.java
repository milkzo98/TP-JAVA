package sn.isi.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {

	private Connection conexion;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	// execution des requetes select
    public ResultSet executeSelect() throws Exception{
        rs = pstm.executeQuery();
        return rs;
    }
    //getteur de pstm
    public PreparedStatement getPstm() {
        return pstm;
    }
	
	public void open() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String mysqlUser = "root";
		String mysqlpassword = "";
		
			Class.forName("com.mysql.jdbc.Driver");
			conexion= DriverManager.getConnection(url, mysqlUser, mysqlpassword);
		}
	public void init (String sql) throws Exception {
		pstm = conexion.prepareStatement(sql);
	}
	public void close() throws Exception{
		if(conexion != null) {
			conexion.close();
		}
	}
	//
	public int executeUpdate() throws Exception{
		int ok = 0;
		ok = pstm.executeUpdate();
		return ok;
	}
}
