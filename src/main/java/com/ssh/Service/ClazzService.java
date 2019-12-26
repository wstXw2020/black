package com.ssh.Service;

import java.util.List;

import com.ssh.pojo.Clazz;

public interface ClazzService {

	List<Clazz> findcAll();
	void save(Clazz clazz);
}
