package com.ssh.DAO;

import java.util.List;

import com.ssh.pojo.Kaoshi;


//���Լ�¼DAO
public interface IKaoshiDAO {
    void save(Kaoshi obj);
    void update(Kaoshi obj);
    void delete(Kaoshi obj);
    Kaoshi findOne(Integer id);
    List<Kaoshi> findAll();
}
