package B9재귀함수;
//재귀
//구현
import java.util.Scanner;

public class B17478 {
	static String underbar = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WhatisRs(sc.nextInt());
	}
	
	public static void WhatisRs(int n) {
		String line = underbar;
		if(n==0) {
			System.out.println(line + "\"재귀함수가 뭔가요?\"");
			System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.println(line + "라고 답변하였지.");
			return;
		}
			//재귀함수 반복
			System.out.println(line +"\"재귀함수가 뭔가요?\"");
			System.out.println(line +"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		
		//줄 생성
		underbar += "____";
		
		WhatisRs(n-1);
		
		//맨 마지막
		System.out.println(line + "라고 답변하였지.");
	}

}
