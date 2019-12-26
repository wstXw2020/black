package com.ssh.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.RolDAO;
import com.ssh.Service.RolService;
import com.ssh.pojo.Rol;


@Transactional
@Service
public class RolServiceDAOImpl implements RolService {

	@Autowired
	RolDAO rd;
	
	@Override
	public List<Rol> findrAllls() {
		// TODO Auto-generated method stub
		List<Rol> list = rd.findrAllls();
		return list;
	}

	@Override
	public List<Rol> findrAll() {
		// TODO Auto-generated method stub
		List<Rol> list = rd.findrAll();
		return list;
	}

	@Override
	public List<Rol> findrAllbzr() {
		// TODO Auto-generated method stub
		List<Rol> list = rd.findrAllbzr();
		return list;
	}

}
