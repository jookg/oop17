package com.joo.oop.service;

import java.util.Scanner;

public class CalcService {
	public String calcBMI(Double kg, Double cm){
		
		double bmi = kg/((cm*0.01)*(cm*0.01));
		String result="";
		/*if(30<=bmi){
			result="비만";
		}else if(29.9>=bmi&&bmi>=25){
			result="과체중";
		}else if(24.9>=bmi&&bmi>=18.5){
			result="정상";
		}else{
			result="저체중";
		}*/
		if(30<=bmi){
			result="비만";
		}else if(bmi>=25){
			result="과체중";
		}else if(bmi>=18.5){
			result="정상";
		}else{
			result="저체중";
		}
		return result;
	}
	public int calcPlus(int a, int b){
		
		int result=a+b;
		return result;
	}
	public int calcCalculator(int a, int b, String opcode) {
		int result = 0;
		if (opcode.equals("+")) {
			result += a + b;
		} else if (opcode.equals("-")) {
			result += a - b;
		} else if (opcode.equals("*")) {
			result += a * b;
		} else {
			result += a / b;
		}
		return result;
	}
	public String calcTime(int insec){
		int hour=0, min=0, sec=0;
		String result="";
		
		if(insec >3599){
			hour=insec/3600;
			min=(insec/60)%60;
			sec=insec%60;
			
			result=hour+"시간 "+min+"분 "+sec+"초";
		}else if(sec>59){
			min=(insec/60)%60;
			sec=insec%60;
			
			result=min+"분 "+sec+"초";
		}else{
			sec=insec%60;
			
			result=sec+"초";
		}
		
		return result;
	}
}
