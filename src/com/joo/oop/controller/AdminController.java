package com.joo.oop.controller;

import javax.swing.JOptionPane;

import com.joo.oop.domain.MemberBean;
import com.joo.oop.service.AdminService;
import com.joo.oop.serviceImpl.AdminServiceImpl;

public class AdminController {

	public static void main(String[] args) {
		AdminService as=new AdminServiceImpl();
		MemberBean mb=null;
		MemberBean[] mbList=null;
		while(true){
			switch (JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수 3.회원목록 4.ID조회 5.이름조회 6.Update 7.Delete")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				mb=new MemberBean();
				String[] arr=JOptionPane.showInputDialog("이름/ID/PW/주민번호").split("/");
				mb.setName(arr[0]);
				mb.setId(arr[1]);
				mb.setPw(arr[2]);
				mb.setSsn(arr[3]);
				as.addMember(mb);
				JOptionPane.showMessageDialog(null, "회원가입 성공");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, as.countMembers());
				break;
			case "3":
				mbList=as.getMembers();
				JOptionPane.showMessageDialog(null, as.getMembers());
				JOptionPane.showMessageDialog(null, mbList.length);
				break;
			case "4":
				String id=JOptionPane.showInputDialog("ID");
				JOptionPane.showMessageDialog(null, as.findById(id)==null?"아이디가 없습니다":as.findById(id));
				break;
			case "5":
				mbList=as.findByName(JOptionPane.showInputDialog("이름"));
				JOptionPane.showMessageDialog(null, mbList.length==0?"목록이 없습니다":mbList);
				break;
			case "6":
				mb=new MemberBean();
				String[] arr2=JOptionPane.showInputDialog("ID/PW").split("/");
				mb.setId(arr2[0]);
				mb.setPw(arr2[1]);
				as.updatePw(mb);
				JOptionPane.showMessageDialog(null, "업데이트 성공");
				break;
			case "7":
				as.delete(JOptionPane.showInputDialog("ID"));
				JOptionPane.showMessageDialog(null, "삭제되었습니다");
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력");
				break;
			}
		} 
	}

}
