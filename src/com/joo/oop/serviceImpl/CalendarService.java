package com.joo.oop.serviceImpl;

public class CalendarService {
	private int year,month,date;
	private String day;
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(String day){
		this.day=day;
	}
	public String getDay(){
		return day;
	}
	public void setDate(int date){
		this.date=date;
	}
	public int getDate(){
		return date;
	}
	public String toString(){
		return year+"년"+month+"월"+date+"일"+day+"요일";
	}

}
