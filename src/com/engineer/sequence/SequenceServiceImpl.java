package com.engineer.sequence;

public class SequenceServiceImpl implements SequenceService{
	//시작값 initNum
	//끝값 limitNum

	@Override
	public String calcArithmetic(SequenceBean seq) {   //바디가 없다.   추상메소드 
		String c1 = "", result = "";			//이거는 아무짝에도 쓸모없는 가비지다. 값만 중요한 거지
		int c2 = 0;
		for (int i = seq.getInitNum(); i <= seq.getLimitNum(); i++) {  //포탈로가면 내용물만가고,  c1, c2, result는  남아져 있다. 쓰레기다
			if(i == seq.getLimitNum()) {								// 가비지 콜렉터,  gc에 의해서 처리된다. 그래서 포탈이나 컨트롤 클래스로 가게되면 다시 그 값의 데이터 타입 스트링을 붙여야 한다. 							
				c1 += i + "=";
			}else {
				c1 += i + "+";
			}
			c2 += i;
			result = c1 + c2;
		}
		return result;
	}

	@Override
	public String calcSwitch(SequenceBean seq) {
		// TODO Auto-generated method stub
		String c3 = "", result = "";			//이거는 아무짝에도 쓸모없는 가비지다. 값만 중요한 거지
		int c4 = 0, res = 0;
		for (int i = seq.getInitNum(); i <= seq.getLimitNum(); i++) {  //포탈로가면 내용물만가고,  c1, c2, result는  남아져 있다. 쓰레기다
			if(i % 2 == 1) {
				c3 += i + "-";							// 가비지 콜렉터,  gc에 의해서 처리된다. 그래서 포탈이나 컨트롤 클래스로 가게되면 다시 그 값의 데이터 타입 스트링을 붙여야 한다. 							
				res += i;
			}else if(i % 2 == 0) {
				if(i == seq.getLimitNum()) {
					c3 += i + "=";
				
				}else{
					c3 += i + "+";
				res -= i;
				}
				c4 = res;
			}
				result = c3 + c4;
		}
		   return result;
		
	}
	
	
	@Override
	public String calcGeometric(SequenceBean ssq) {
		return null;
		
		
	}

	@Override
	public String calcDifference(SequenceBean seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcFactorial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcFibonacci() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		
}
