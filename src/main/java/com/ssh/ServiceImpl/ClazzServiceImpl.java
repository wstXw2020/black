package com.ssh.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.ClazzDAO;
import com.ssh.Service.ClazzService;
import com.ssh.pojo.Clazz;

@Transactional
@Service
public class ClazzServiceImpl implements ClazzService {

	@Autowired
	ClazzDAO cd;
	
	@Override
	public List<Clazz> findcAll() {
		// TODO Auto-generated method stub
		return cd.findcAll();
	}

	@Override
	public void save(Clazz clazz) {
		// TODO Auto-generated method stub
		cd.save(clazz);
	}

}
