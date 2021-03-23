package sn.isi.controller;


import java.util.List;

import sn.exo.entities.User;

public interface IUSER {

	public int add(User u) throws Exception;
	public int delete(int id) throws Exception;
	public int update(User u) throws Exception;
	public User getUser(int id) throws Exception;
	public List<User> liste() throws Exception;
	
}
