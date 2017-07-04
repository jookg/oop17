package com.joo.oop.serviceImpl;

public class TaxCalculatorService {
	public String excute(String name, int pay){
		double taxrate=0.0;
		
		if(pay>8300){
			taxrate=0.35;
		}else if(pay>4600){
			taxrate=0.26;
		}else if(pay>1200){
			taxrate=0.17;
		}else{
			taxrate=0.08;
		}
		return taxrate+":"+pay*taxrate;
	}
}
