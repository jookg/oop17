package com.joo.oop.controller;
import java.util.Scanner;

import com.joo.oop.service.MemberService;
public class MemberContoller {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MemberService ms=new MemberService();
		while(true){
			System.out.println("0.end 1.join 2.login");
			switch (s.next()) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				System.out.println("아이디");
				String id=s.next();
				ms.setId(id);
				System.out.println("비밀번호");
				String pw=s.next();
				ms.setPw(pw);
				System.out.println("이름");
				String name=s.next();
				ms.setName(name);
				System.out.println("주민번호");
				String ssn=s.next();
				ms.setSsn(ssn);
				System.out.println("회원가입 완료");
				break;
			case "2":
				System.out.println("아이디");
				String id2=s.next();
				System.out.println("비밀번호");
				String pw2=s.next();
				ms.SetLogin(id2, pw2);
				System.out.println(ms.getLogin());
				break;
			default:
				break;
			}
		}

	}

}
