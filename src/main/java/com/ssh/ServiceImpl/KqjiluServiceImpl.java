package com.ssh.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.IKqjiluDAO;
import com.ssh.Service.IKqjiluService;
import com.ssh.pojo.Kqjilu;





@Service
@Transactional
public class KqjiluServiceImpl implements IKqjiluService{
  
	@Autowired
	IKqjiluDAO kd;
	@Override
	public List<Kqjilu> findAll() {
		
		return kd.findAll();
	}

}
