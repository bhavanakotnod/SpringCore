package com.tka;

import org.springframework.stereotype.Component;

@Component("engg")
public class Engineering implements HigherSecondary {

	public String stream() {
		
		return "After 12th you choose Engineering ";
	}

}
