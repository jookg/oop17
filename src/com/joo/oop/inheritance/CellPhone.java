package com.joo.oop.inheritance;

public class CellPhone extends Phone{
	private boolean portable;
	protected String move;
	public final static String KIND="휴대폰";
	public void setMove(String move){
		this.move=move;
	}
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동가능");
		}else{
			this.setMove("이동불가능");
		}
		this.portable=portable;
	}
	public boolean isPortable(){
		return portable;
	}
	@Override
	public String toString(){
		return KIND+"이기 때문에"+move+" 한상태로"+super.name+"에게 "+phoneNo+" 번호로\n"
				+super.brand+KIND+"를 사용해서 "+super.call+"이라고 통화했다";
	}
}
