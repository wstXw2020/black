package com.ssh.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.IKaoshiDAO;
import com.ssh.Service.IKaoshiService;
import com.ssh.pojo.Kaoshi;


@Service
@Transactional
public class KaoshiServiceImpl implements IKaoshiService{
    @Autowired
	IKaoshiDAO kd;//×Ô¶¯×°ÅäIKaoshiDAO
	@Override
	public List<Kaoshi> findAll() {
		
		return kd.findAll();
	}
	@Override
	public void save(Kaoshi obj) {
		// TODO Auto-generated method stub
		kd.save(obj);
	}
	@Override
	public void update(Kaoshi obj) {
		// TODO Auto-generated method stub
		kd.update(obj);
	}
	@Override
	public Kaoshi findOne(Integer id) {
		Kaoshi ka= kd.findOne(id);
		return ka;
	}

}
