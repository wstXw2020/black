package com.ssh.Service;

import java.util.List;

import com.ssh.pojo.Kaoshi;



public interface IKaoshiService {
	void save(Kaoshi obj);
	List<Kaoshi> findAll();
	 void update(Kaoshi obj);
	 Kaoshi findOne(Integer id);
}
