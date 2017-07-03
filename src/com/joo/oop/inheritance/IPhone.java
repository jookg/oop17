package com.joo.oop.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	// KIND 스마트폰이라고 오버라이딩...
	public final static String KIND="스마트폰";
	public final static String BRAND="아이폰";
	public void setData(String data){
		this.data=data;
		setPortable(true);
	}
	public String getData(){
		return data;
	}
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		//아이폰을 사용해서 안녕이라고 문자를 전송했다
		return KIND+"이기 때문에 "+move+"한 상태로"+name+"에게 "+phoneNo+" 번호로\n"
				+BRAND+"를 사용해서 "+data+"라고 문자했다";
	}
}
