package com.joo.oop.serviceImpl;

import java.util.Scanner;

public class CalcService {
	
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
