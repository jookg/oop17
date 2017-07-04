package com.joo.oop.serviceImpl;

import com.joo.oop.domain.MemberBean;
import com.joo.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private int memberCount;
	MemberBean[] memberList;
	//String[] memberList;
	public AdminServiceImpl(int count){
		memberCount=0;
		memberList=new MemberBean[count];
		//memberList=new String[count];
	}
	@Override
	public void addMember(MemberBean member) {
		//memberList[memberCount]=member.toString();
		memberList[memberCount]=member;
//		for (int i = 0; i < (memberCount+1); i++) {
//			System.out.println(memberList[i].toString());
//		}
		memberCount++;
	}

	@Override
	public MemberBean[] getMembers() {
		return memberList;
	}

	@Override
	public int countMembers() {
		return memberCount;
	}
	@Override
	public MemberBean findById(String id) {
		MemberBean member=null;
		for (int i = 0; i < memberCount; i++) {
			if(id.equals(memberList[i].getId())){
				member = memberList[i];
			break;
			}
		}
		
		return member;
	}
	@Override
	public MemberBean[] findByName(String name) {
		int scount=0,j=0;
		for (int i = 0; i < memberCount; i++) {
			if(name.equals(memberList[i].getName())){
			scount++;
			}
		}
		MemberBean[] searchList=new MemberBean[scount];
		for (int i = 0; i < memberCount; i++) {
			if(name.equals(memberList[i].getName())){
			searchList[j]=memberList[i];
			j++;
			}
			if(scount==j){
				break;
			}
		}
		return searchList;
	}
	@Override
	public void updatePw(MemberBean member) {
		for (int i = 0; i < memberCount; i++) {
			if(member.getId().equals(memberList[i].getId())){
				memberList[i].setPw(member.getPw());
			break;
			}
		}
		
	}

}
