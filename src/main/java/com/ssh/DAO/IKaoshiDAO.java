package com.ssh.DAO;

import java.util.List;

import com.ssh.pojo.Kaoshi;


//¿¼ÊÔ¼ÇÂ¼DAO
public interface IKaoshiDAO {
    void save(Kaoshi obj);
    void update(Kaoshi obj);
    void delete(Kaoshi obj);
    Kaoshi findOne(Integer id);
    List<Kaoshi> findAll();
}
