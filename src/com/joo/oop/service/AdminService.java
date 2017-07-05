package com.joo.oop.service;

import com.joo.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean member);
	public MemberBean[] getMembers();
	public int countMembers();
	public MemberBean findById(String id);
	public MemberBean[] findByName(String name);
	public void updatePw(MemberBean member);
	public void delete(String id);
	
}
