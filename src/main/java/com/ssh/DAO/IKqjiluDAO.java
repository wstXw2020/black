package com.ssh.DAO;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.pojo.Kqjilu;
//¿¼ÇÚ¼ÇÂ¼DAO
public interface IKqjiluDAO {
         void save(Kqjilu obj);
	    List<Kqjilu> findAll();
}
