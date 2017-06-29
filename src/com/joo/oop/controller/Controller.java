package com.joo.oop.controller;
import java.util.Scanner;
import com.joo.oop.service.CalcService;
import com.joo.oop.service.TaxCalculatorService;
import com.joo.oop.service.LeapYearService;
public class Controller {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CalcService s2=new CalcService();
		while(true){
			System.out.println("0.종료 1.bmi 2.tax 3.+ 4.계산기 5.윤년 6.시간계산");
			String flag=s.next();
			switch(flag){
			case "0": 
				System.out.println("종료");
				return;
			case "1": 
				System.out.print("체중(kg)\n");
				double kg = s.nextDouble();
				System.out.print("키(cm)\n");
				double cm = s.nextDouble();
				String state=s2.calcBMI(kg,cm);
				System.out.print("나의 체질량지수(BMI): ");
				System.out.println(state);
				break;
			case "2":
				System.out.println("tax");
				System.out.println("이름을 입력하세요.");
				String name=s.next();
				System.out.println("연봉을 입력하세요.");
				int pay=s.nextInt();
				TaxCalculatorService tx=new TaxCalculatorService();
				String result3 = tx.excute(name,pay);
				String[] tax = result3.split("|");
				String taxrate = tax[0];
				String rate = tax[1];
				//double rate = Double.parseDouble(tax[1]);
				//String.valueOf(b);
				System.out.println("*****************");
				System.out.println(" 이름  연봉  세율   납부할 세금");
				System.out.println("-----------------");
				System.out.println(String.format("  %s   %d   %s  %s",name,pay,rate,result3));
				System.out.println("*****************");
				break;
			case "3":
				System.out.println("+");
				System.out.print("숫자\n");
				int a=s.nextInt();
				System.out.print("숫자\n");
				int b=s.nextInt();
				int result=s2.calcPlus(a, b);
				
				System.out.println(a+"+"+b+"="+result);
				break;
			case "4":
				System.out.println("계산기");
				System.out.print("숫자\n");
				int a2=s.nextInt();
				System.out.print("연산기호\n");
				String opcode=s.next();
				System.out.print("숫자\n");
				int b2=s.nextInt();
				int result2=s2.calcCalculator(a2, b2, opcode);
				
				System.out.println(String.format("%d %s %d = %d", a2, opcode, b2, result2));
				break;
			case "5":
				LeapYearService ly= new LeapYearService();
				System.out.print("연도:");
				int year = s.nextInt();
				String resultyear = ly.excute(year);
				
				System.out.println(resultyear);
				break;
			case "6":
				System.out.println("초를 입력하세요.");
				int insec=s.nextInt();
				String times=s2.calcTime(insec);
				System.out.print(times);
				break;
			default :
					System.out.println("잘못된입력입니다");
				break;
			}
		}
		
		
	}
}
