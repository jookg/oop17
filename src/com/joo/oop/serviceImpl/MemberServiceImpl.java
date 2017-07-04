package com.joo.oop.serviceImpl;

import com.joo.oop.domain.MemberBean;
import com.joo.oop.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberBean session;
	public MemberServiceImpl(){
		session=new MemberBean();
	}
	@Override
	public String getGender(MemberBean member) {
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

	@Override
	public String getAge(MemberBean member) {
		return String.valueOf((17-Integer.parseInt(member.getSsn().substring(0,2))>=0)? 
				17-Integer.parseInt(member.getSsn().substring(0,2))+1 : 117-Integer.parseInt(member.getSsn().substring(0,2))+1);
	}

	@Override
	public String join(MemberBean member) {
		String result="환영합니다";
		session=member;
		return result;
	}

	@Override
	public String getLogin(MemberBean member) {
		String login="";
		//System.out.println(member.getId()+session.getId()+session.getName());
		if(!member.getId().equals(session.getId())){
			login="아이디가 틀렸습니다";
		}else if(member.getPw().equals(session.getPw())){
			login=member.toString()+session.getName()+"님 "+getGender(session)+getAge(session);
		}else{
			login="비밀번호가 틀렸습니다";
		}
		return login;
	}

}
