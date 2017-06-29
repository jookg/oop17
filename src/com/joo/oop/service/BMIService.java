package com.joo.oop.service;

public class BMIService {
	private double bmi,kg,cm;
	private String state;
	public void setKg(double kg){
		this.kg=kg;
	}
	public void setCm(double cm){
		this.cm=cm;
	}
	public double getKg(){
		return kg;
	}
	public double getCm(){
		return cm;
	}
	public void setBmi(){
		this.bmi = kg/((cm*0.01)*(cm*0.01));
	}
	public double getBmi(){
		return bmi;
	}
	public void setState(){
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
			this.state="비만";
		}else if(bmi>=25){
			this.state="과체중";
		}else if(bmi>=18.5){
			this.state="정상";
		}else{
			this.state="저체중";
		}
	}
	public String getState(){
		return state;
	}
}
