package com.engineer.sequence;

public interface SequenceService {
	/*
	 등차수열  : Arithmetic
	 1 +2 + 3+ 4 +5...+100 = 5050 
	 */
	
	public String calcArithmetic(SequenceBean seq);     // + 문제  등차수열
	/*
	 스위치 수열 : Switch
	 1 -2 +3 -4 +5... -100 = -50
	 */
	public String calcSwitch(SequenceBean seq);			// + - 문제
	/*
	 등비 수열 : Geometric 
	 요구사항
	다음 등비 수열에 대하여 100번째 항까지의 합을 구하는 알고리즘
	2, 6, 18, 54, 162, 486, ...

	문제 공략
	N번째 항은 초항 A1에 공비 R의 (N-1)제곱하여 얻어진다. 즉, AN = A1 * R^(N-1). (^표시는 제곱근을 나타낸다)

	초항부터 100번째 항까지의 합이므로 반복구조를 통하여 누적한다.

	변수설명
	A - 초항을 나타내는 변수, 여기서는 2
	R - 공비를 나타내는 변수, 여기서는 3
	S - 초항부터 100번째 항까지의 합을 보관하는 변수, 초기값을 초항 A로 잡았다.
	N - 등비 수열의 항 순서를 나타내는 변수, 초항을 S로 설정하여 출발하였으므로 N은 2부터 시작
	An - N번째 항을 나타내는 변수. An = A * R^(N-1)
	 */
	public String calcGeometric(SequenceBean ssq);
	
	/*
	  계차 수열 : Difference
	 * 1 + 2 + 4 + 7 + 11 + 16 + 22... 100칸까지
	 */
	public String calcDifference(SequenceBean seq);
	/*
	 팩토리얼 수열 : Factorial
	 1! + 2! + 3! + 4! + 5! ... + 10!
	 */
	public String calcFactorial();
		
	
	/*
	 피보나치 수열 : Fibonacci
	 1 + 1 + 2 + 3 + 5 + 8 + 13
	 
	 */
	public String calcFibonacci(); 
		
	}

