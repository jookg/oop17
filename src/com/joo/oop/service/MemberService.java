package com.joo.oop.service;

public class MemberService {
	private String id,pw,name,ssn,gender,age,login;
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		this.pw=pw;
	}
	public String getPw(){
		return pw;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	public void setAge(){
		String sYear=ssn.substring(0,2);
		int year=Integer.parseInt(sYear);
		int gap=17-year;
		age=String.valueOf((gap>=0)? 17-year+1 : 117-year+1);
	}
	public String getAge(){
		
		return age;
	}
	public void setGen(){
		char ch = ssn.charAt(7);
		switch (ch){
			case '1':
			case '3':
				this.gender = "남자";
				break;
			case '2':
			case '4':
				this.gender = "여자";
				break;
			case '5':
			case '6':
				this.gender = "외국인";
				break;
			default:
				this.gender = "잘못입력";
				break;
		}
	}
	public String getGen(){
		return gender;
	}
	public void SetLogin(String id, String pw){
		if(!this.id.equals(id)){
			login="아이디가 틀렸습니다";
		}else if(this.pw.equals(pw)){
			login=toString();
		}else{
			login="비밀번호가 틀렸습니다";
		}
	}
	public String getLogin(){
		return login;
	}
	public String toString(){
		setAge();
		setGen();
		return "Welcom"+name+gender+age+"님 환영합니다";
	}
	
}
