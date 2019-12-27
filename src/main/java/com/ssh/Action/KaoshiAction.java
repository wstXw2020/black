package com.ssh.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.Service.IKaoshiService;
import com.ssh.pojo.Kaoshi;
import com.ssh.pojo.Student;



@Controller
public class KaoshiAction {
  
	@Autowired
    private IKaoshiService ks;
	private Kaoshi ka;
	private List<Kaoshi> kas;
	private Student student;
	
	public IKaoshiService getKs() {
		return ks;
	}
	public void setKs(IKaoshiService ks) {
		this.ks = ks;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Kaoshi getKa() {
		return ka;
	}
	public void setKa(Kaoshi ka) {
		this.ka = ka;
	}
	public List<Kaoshi> getKas() {
		return kas;
	}
	public void setKas(List<Kaoshi> kas) {
		this.kas = kas;
	}
//	public IKaoshiService getKs() {
//		return ks;
//	}
//	public void setKs(IKaoshiService ks) {
//		this.ks = ks;
//	}
	
	public String kaList() {
		System.out.println("===================");
		kas = ks.findAll();
		//System.out.println(kas);
		return "kaList";
	}
	
	public String saveUI() {
//	System.out.println(ka.getScid());
		ka=ks.findOne(ka.getScid());
//		ks.save(ka);
		//System.out.println(ka.getScid());
		return "saveUI";
	}
	
	public String save() {
		//System.out.println("KaoshiAction.save()");
		System.out.println("abc");
		System.out.println("id:"+ka.getScid());
		System.out.println("学生："+ka.getStudent().getSid());
		System.out.println("阶段："+ka.getJieduan().getLid());
		System.out.println("分数"+ka.getScore());
	    System.out.println("日期"+ka.getDate());
		ks.update(ka);
		return "save";
	}
	
}
