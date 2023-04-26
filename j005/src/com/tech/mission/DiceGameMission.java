package com.tech.mission;

public class DiceGameMission {
	public static void main(String[] args) {
		/*
		 주사위 게임
		 랜덤 주사위 받기
		 kim, 컴퓨터
		 큰 수를 받는 사람이 승리
		 판정.
		 결과: 김씨는 3, 컴퓨터는 5 -> 컴퓨터 승리
		 */
		
		
		int kim = (int)(Math.random()*6) + 1;
		int com = (int)(Math.random()*6) + 1;
		String result = "";
		
		if(kim > com) {
			result = "김씨가 승리했습니다.";
		}else if(kim < com) {
			result = "컴퓨터가 승리했습니다.";
		}else {
			result = "김씨와 컴퓨터가 비겼습니다.";
		}	
		
		System.out.println("김씨의 주사위: "+kim);
		System.out.println("컴퓨터의 주사위: "+com);
		System.out.println(result);
					
	}
}
