package com.joo.oop.controller;

import javax.swing.JOptionPane;

import com.joo.oop.inheritance.AndroidPhone;
import com.joo.oop.inheritance.CellPhone;
import com.joo.oop.inheritance.IPhone;
import com.joo.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		//길동이에게 02-123-4567 번호로
		//삼성집전화기를 사용해서 안녕이라고 통화했다
		CellPhone nokia=new CellPhone();
		Phone p=new Phone();
		IPhone ip=new IPhone();
		AndroidPhone ap=new AndroidPhone();
		while(true){
			switch (JOptionPane.showInputDialog("0.종료 1.집전화 2.휴대폰 3.아이폰 4.안드로이드")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				p.setName(JOptionPane.showInputDialog("이름"));
				p.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				p.setBrand(JOptionPane.showInputDialog("브랜드"));
				p.setCall(JOptionPane.showInputDialog("내용"));
				JOptionPane.showMessageDialog(null, p.toString());
				break;
			case "2":
				nokia.setName(JOptionPane.showInputDialog("이름"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				nokia.setBrand(JOptionPane.showInputDialog("브랜드"));
				nokia.setCall(JOptionPane.showInputDialog("내용"));
				nokia.setPortable(true);
				JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3":
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				ip.setData(JOptionPane.showInputDialog("문자"));
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case "4":
				ap.setName(JOptionPane.showInputDialog("이름"));
				ap.setPhoneNo(JOptionPane.showInputDialog("전화번호"));
				ap.setData(JOptionPane.showInputDialog("문자"));
				ap.setSize(JOptionPane.showInputDialog("사이즈"));
				ap.setAppl(JOptionPane.showInputDialog("어플"));
				JOptionPane.showMessageDialog(null, ap.toString());
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력");
				break;
			}
		}
	}

}
