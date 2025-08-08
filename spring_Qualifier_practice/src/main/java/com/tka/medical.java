package com.tka;

import org.springframework.stereotype.Component;

@Component("medi")
public class medical  implements HigherSecondary{

	public String stream() {
				return "After 12th you go to  medical";
	}

}
