package com.engineer.sequence;

public class SequenceBean {
	//시작값 initNum
	//끝값 limitNum
	
	int initNum, limitNum;
	public SequenceBean() {}   //파라미터 없는 이유 (생성자)
	public void setInitNum(int initNum) {
		this.initNum = initNum;
	}
	public int getInitNum() {
		return initNum;
	}
	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}
	public int getLimitNum() {
		return limitNum;
	}
	
}