package com.ssh.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.Service.IKqjiluService;
import com.ssh.pojo.Kqjilu;
import com.ssh.pojo.Kqtype;
import com.ssh.pojo.Student;



@Controller
public class KqjiluAction {

	  @Autowired
	  private IKqjiluService ks;
	  private Kqjilu kq;
	  private List<Kqjilu> kqs;
      private Kqtype kqtype;
	  private Student student;
	  
	  
//	public Kqtype getKqtype() {
//		return kqtype;
//	}
//	public void setKqtype(Kqtype kqtype) {
//		this.kqtype = kqtype;
//	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//	public IKqjiluService getKs() {
//		return ks;
//	}
//	public void setKs(IKqjiluService ks) {
//		this.ks = ks;
//	}
	public Kqjilu getKq() {
		return kq;
	}
	public void setKq(Kqjilu kq) {
		this.kq = kq;
	}
	
	  
	  public List<Kqjilu> getKqs() {
		return kqs;
	}
	public void setKqs(List<Kqjilu> kqs) {
		this.kqs = kqs;
	}
	
	//列表展示
	public String kqList() {
		System.out.println("aaaa==asdsdad");
		kqs = ks.findAll();
		  //System.out.println(kqs);
//		System.out.println("考勤名字：");
//		System.out.println(kqs);
		  return "kqList";
	  }
}
