package com.joo.oop.controller;
import java.util.Scanner;

import com.joo.oop.domain.MemberBean;
import com.joo.oop.service.MemberService;
import javax.swing.*;
public class MemberContoller {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MemberService ms=new MemberService();
		MemberBean member=new MemberBean();
		while(true){
			//System.out.println("0.end 1.join 2.login");
			//String flag=JOptionPane.showInputDialog("0.end 1.join 2.login");
			switch (JOptionPane.showInputDialog("0.end 1.join 2.login")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				member.setId(JOptionPane.showInputDialog("ID"));
				member.setPw(JOptionPane.showInputDialog("PW"));
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				JOptionPane.showMessageDialog(null, ms.join(member));
				break;
			case "2":
				MemberBean m2=new MemberBean();
				m2.setId(JOptionPane.showInputDialog("ID"));
				m2.setPw(JOptionPane.showInputDialog("PW"));
				JOptionPane.showMessageDialog(null, ms.getLogin(m2));
				break;
			default:
				break;
			}
		}

	}

}
