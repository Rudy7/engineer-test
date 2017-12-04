package com.engineer.sequence;

import java.util.Scanner;
//시작값 initNum
//끝값 limitNum
//합계 sum

public class SequenceController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SequenceBean seq = null;
//		SequenceBean seq = new SequenceBean(); // 생성자는 단 한번 호출된다. 와일 안에 넣으면 무한으로 생성된다.
		SequenceService service = new SequenceServiceImpl(); // SequenceServiceImpl();인데 SequenceService();로 실수함.
//		int a = 3;			 i는 디폴트라서 안 줘도 된다. 
//		double d = 3.0D;     d는 디폴트라서 안 줘도 되다. 
//		float f = 3.0F;      f를 안 적어주면 에러가 뜬다.   실수는 더블과 플로에서  더블이 디폴트다.

		while (true) {
			System.out.println("[MENU] 0.정지 1.등차수열 2.스위치수열 3.분수수열");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("정지합니다.");
				return;
			case 1:
				int i = 0, getInitNum = 0, getLimitNum = 0, sum = 0, res = 0;
				seq = new SequenceBean();   //새로 다른 친구들을 만들어야 하니까. 시퀀스가 다 다른 녀석이라서 
				System.out.println("시작값 입력");
				seq.setInitNum(scanner.nextInt());
				System.out.println("끝(리미트)값 입력");
				seq.setLimitNum(scanner.nextInt());			   //타입주는 이유=임플내에서 타입결정되고, 리턴으로 끝나서 여기와서 다시 타입을 잡아줘야한다. 
//				String result = service.calcArithmetic(seq);   // @@@@ 리턴하는 타입은 String 이다. 타입 안주면 오류난다.
//				System.out.println(result);                    // 이 두 줄을 합쳐서 아래줄이 된다. 
				System.out.println(service.calcArithmetic(seq));   // 이해 해야한다. 어렵다.
//				service.calcArithmetic(seq)         // 이렇게만 하면 미션처리 못하고 혼자 죽어버린다. null이 된다. 
//				String result2 = service.calcArithmetic(seq);
//				System.out.println(result2);
				
				break;
			case 2:
				seq = new SequenceBean();   //새로 다른 친구들을 만들어야 하니까. 시퀀스가 다 다른 녀석이라서 
				System.out.println("시작값 입력");
				seq.setInitNum(scanner.nextInt());
				System.out.println("끝(리미트)값 입력");
				seq.setLimitNum(scanner.nextInt());			   
				System.out.println(service.calcSwitch(seq)); 
//				switch() {}
				
				break;

			}
		}

	}

}
