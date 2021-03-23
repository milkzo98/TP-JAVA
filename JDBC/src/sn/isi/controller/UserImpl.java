package sn.isi.controller;

import java.sql.ResultSet;

import java.util.List;
import java.util.Scanner;

import sn.exo.entities.User;

public class UserImpl implements IUSER {
DB db = new DB();
Scanner scan = new Scanner(System.in);
	@Override
	public int add(User u) throws Exception {
		db.open();
		System.out.println("Entrer le prenom du user");
		u.setPrenom(scan.nextLine());
		System.out.println("Entrer le nom du user");
		u.setNom(scan.nextLine());
		System.out.println("Entrer le mail du user");
		u.setEmail(scan.nextLine());
        System.out.println("Entrer le password du user");
        u.setPassword(scan.nextLine());
		
        String sql = "INSERT INTO user VALUES (null, ?, ?, ?)";
        db.init(sql);
        db.getPstm().setString(1,u.getPrenom());
        db.getPstm().setString(2,u.getNom());
        db.getPstm().setString(3,u.getEmail());
        db.getPstm().setString(4,u.getPassword());

        int ok = db.executeUpdate();
        
        return ok;
	}

	@Override
	public int delete(int id) throws Exception {
		  User u = null;
	        db.open();
	        String sql = "DELETE FROM user WHERE id = ?";
	        db.init(sql);
	        int ok = db.executeUpdate();
	        return ok;
	    }
	

	@Override
	public int update(User u) throws Exception {
		String sql = "UPDATE user SET prenom = ?, nom = ?, mail = ?, password = ? WHERE id = ?";
        db.init(sql);
        db.getPstm().setString(1,u.getPrenom());
        db.getPstm().setString(2,u.getNom());
        db.getPstm().setString(3,u.getEmail());
        db.getPstm().setString(4,u.getPassword());
        db.getPstm().setInt(5,u.getId());


        int ok = db.executeUpdate();
        return ok;
		
	}

	@Override
	public User getUser(int id) throws Exception {
		 
			 User  u = null;
		        db.open();
		        String sql = "SELECT * FROM user WHERE id = ?";
		        db.init(sql);
		        ResultSet rs = db.executeSelect();
		        db.getPstm().setInt(1,id);
		        if(rs.next()){
		            u = new User();
		            u.setId(rs.getInt(1));
		            u.setPrenom(rs.getString(2));
		            u.setNom(rs.getString(3));
		            u.setEmail(rs.getString(4));
		            u.setPassword(rs.getString(5));

		        }
		        return u;
		
		
	}

	@Override
	public List<User> liste() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	
}
