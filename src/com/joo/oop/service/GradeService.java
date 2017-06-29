package com.joo.oop.service;

import java.util.Scanner;

public class GradeService {
	private int kor,eng,math,total,avg;
	private String grade,name, major;
	public void setKor(int kor){
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public void SetName(String name){
		this.name=name;
	}
	public String getnName(){
		return name;
	}
	public void SetMajor(String major){
		this.major=major;
	}
	public String getMajor(){
		return major;
	}
	public void setTotal(){
		this.total=kor+eng+math;
	}
	public int getTotal(){
		setAvg();
		setGrade();
		return total;
	}
	public void setAvg(){
		this.avg=total/3;
	}
	public int getAvg(){
		return avg;
	}
	public void setGrade(){
		/*
		if(avg>89){
			result = "A";
		}else if(avg>79){
			result = "B";
		}else if(avg>69){
			result = "C";
		}else if(avg>59){
			result = "D";
		}else{
			result = "E";
		}
		          avg/10    */  
		switch((int) (avg*0.1)){
			case 10:
			case 9:
				this.grade="A학점";
			break;
			case 8:
				this.grade="B학점";
			break;
			case 7:
				this.grade="C학점";
			break;
			case 6:
				this.grade="D학점";
			break;
			case 5:
				this.grade="E학점";
			break;
			default:
				this.grade="F학점";
			break;
		}
	}
	public String getGrade(){
		return grade;
	}
	public String toString(){
		return "*****************************\n"
				+"이름   전공   총점   평균   학점\n"
				+name+"\t"+major+total+"\t"+avg+"\t"+grade+"\n"
				+"*****************************";
	}
}
