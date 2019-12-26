package com.ssh.DAO;

import java.util.List;

import com.ssh.pojo.Clazz;

public interface ClazzDAO {

	List<Clazz> findcAll();
	void save(Clazz clazz);
	
}
