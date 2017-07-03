package com.joo.oop.inheritance;

public class AndroidPhone extends IPhone{
	//BRAND 갤럭시노트
	public final static String BRAND="갤럭시노트";
	private String size,appl;
	public void setSize(String size){
		this.size=size;
		setPortable(true);
	}
	public String getSize(){
		return size;
	} 
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		//갤럭시노트 6인치를 사용해서 안녕이라고 카톡을 전송했다
		return KIND+"이기 때문에 "+move+"한 상태로"+name+"에게 "+phoneNo+" 번호로\n"
				+BRAND+size+"인치를 사용해서 "+data+"라고 "+appl+"했다";
	}
}
