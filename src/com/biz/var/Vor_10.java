package com.biz.var;

public class Vor_10 {

	public static void main(String[] args) {

		int i=2;
		int j=2;
		// 만약 i가 9인경우
		for(i=2;i<=100;i++) {
			for(j=2;j<i;j++) {
				// index가 3이 되는 경우
				// 9%3==0 의 조건문이 true가 되고
				// 9%4 이후는 계산할 필요가 없다
				if(i%j==0) {
					break;
				}
			}
			// break 이후 실행되는 곳
			// i 값이 소수이면
			//     j>=i
			if(j>=i) {
				System.out.println(i+"는 소수입니다");
			}
		}
		
		
	
	}
	}
