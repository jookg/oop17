package com.joo.oop.service;

public class LeapYearService {
	public String excute(int year){
		String result="";
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					result="윤년";
				}else{
					result="평년";
				}
			}else{
				result="윤년";
			}
		}else{
			result="평년";
		}
		return result;
	}
}
