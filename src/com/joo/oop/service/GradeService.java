package com.joo.oop.service;
import com.joo.oop.domain.GradeBean;

public class GradeService {
	public int getTotal(GradeBean grade){
		return grade.getKor()+grade.getEng()+grade.getMath();
	}
	public int getAvg(int total){
		return total/3;
	}
	public String getGrade(int avg){
		String grade="";
		switch((int) (avg*0.1)){
			case 10:
			case 9:
				grade="A학점";
			break;
			case 8:
				grade="B학점";
			break;
			case 7:
				grade="C학점";
			break;
			case 6:
				grade="D학점";
			break;
			case 5:
				grade="E학점";
			break;
			default:
				grade="F학점";
			break;
		}
		return grade;
	}
	
}
