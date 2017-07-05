package com.joo.oop.serviceImpl;

import java.util.Arrays;

import com.joo.oop.domain.MemberBean;
import com.joo.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private int memberCount;
	MemberBean[] memberList;
	public AdminServiceImpl(){
		memberCount=0;
		memberList=new MemberBean[memberCount];
	}
	@Override
	public void addMember(MemberBean member) {
		memberList=Arrays.copyOf(memberList,memberList.length+1);
//		if(memberCount==memberList.length){
//		MemberBean[] temp=new MemberBean[memberCount+1];
//		System.arraycopy(memberList, 0, temp, 0, memberCount);
//		memberList=temp;
//		}
		memberList[memberCount]=member;
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
	@Override
	public void delete(String id) {
		for (int i = 0; i < memberCount; i++) {
			if(id.equals(memberList[i].getId())){
				//memberList[i]=memberList[memberCount-1];
					for (; i < memberCount-1; i++) {
						memberList[i]=memberList[i+1];
					}
				//memberList[memberCount-1]=null;
				memberList=Arrays.copyOf(memberList,memberCount-1);
				memberCount--;
				break;
			}
		}
		
	}

}
