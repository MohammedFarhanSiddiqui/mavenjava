package com.alice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevTestt {

	@Test
	void test() {
		Rev r=new Rev();
		assertEquals("ecila",r.revv("alice"));
		
	}

}
