package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Qualifier("engg")
	@Autowired
	private HigherSecondary hs1;
	@Qualifier("medi")
	@Autowired
	private HigherSecondary hs2;
	public HigherSecondary getHs1() {
		return hs1;
	}
	public void setHs1(HigherSecondary hs1) {
		this.hs1 = hs1;
	}
	public HigherSecondary getHs2() {
		return hs2;
	}
	public void setHs2(HigherSecondary hs2) {
		this.hs2 = hs2;
	}
	@Override
	public String toString() {
		return "Student [hs1=" + hs1 + ", hs2=" + hs2 + "]";
	}
	
	
	

	
}
