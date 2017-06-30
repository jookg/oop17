package com.joo.oop.service;

import com.joo.oop.domain.MemberBean;

public class MemberService {
	MemberBean session;
	public MemberService(){
		session=new MemberBean();
	}
	public String getAge(MemberBean member){
		return String.valueOf((17-Integer.parseInt(member.getSsn().substring(0,2))>=0)? 
			   17-Integer.parseInt(member.getSsn().substring(0,2))+1 : 117-Integer.parseInt(member.getSsn().substring(0,2))+1);
	}
	public String getGener(MemberBean member){
		String gender="";
		char ch = member.getSsn().charAt(7);
		switch (ch){
			case '1':
			case '3':
				gender = "남자";
				break;
			case '2':
			case '4':
				gender = "여자";
				break;
			case '5':
			case '6':
				gender = "외국인";
				break;
			default:
				gender = "주민번호 잘못입력";
				break;
		}
		return gender;
	}
	public String join(MemberBean member){
		String result="환영합니다";
//		System.out.println("회원가입시 사용한 ID: "+member.getId());
//		System.out.println("회원가입시 사용한 PW: "+member.getPw());
//		System.out.println("회원가입시 사용한 이름: "+member.getName());
//		System.out.println("회원가입시 사용한 SSN: "+member.getSsn());
		session=member;
		return result;
	}
	public String getLogin(MemberBean member){
		String login="";
		//System.out.println(member.getId()+session.getId()+session.getName());
		if(!member.getId().equals(session.getId())){
			login="아이디가 틀렸습니다";
		}else if(member.getPw().equals(session.getPw())){
			login=member.toString()+session.getName()+"님 "+getGener(session)+getAge(session);
		}else{
			login="비밀번호가 틀렸습니다";
		}
		return login;
	}
	
	
}
