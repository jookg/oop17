package com.joo.oop.service;

import com.joo.oop.domain.MemberBean;

public interface MemberService {
	public String getGender(MemberBean member);
	public String getAge(MemberBean member);
	public String join(MemberBean member);
	public String getLogin(MemberBean member);
}
