package com.joo.oop.controller;
import com.joo.oop.domain.GradeBean;
import com.joo.oop.service.GradeService;
import com.joo.oop.serviceImpl.GradeServiceImpl;

import javax.swing.*;
public class GradeController {
	public static void main(String[] args) {
		GradeService gs=new GradeServiceImpl();
		GradeBean gb=new GradeBean();
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.grade")){
			case "0": 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				gb.setName(JOptionPane.showInputDialog("이름"));
				gb.setMajor(JOptionPane.showInputDialog("전공"));
				gb.setKor(Integer.parseInt(JOptionPane.showInputDialog("언어")));
				gb.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어")));
				gb.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학")));
				JOptionPane.showMessageDialog(null, gb.getnName()+"님 "+gs.getGrade(gs.getAvg(gs.getTotal(gb))));
				break;
			default :
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다");
				break;
			}
		}
		
		
	}
}
