package com.lti.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import demomaven.calc;

public class Calculatortest {

@Test
public void testcases() {
	calc c=new calc();
	int x=c.add(10, 20);
	int y=30;
	assertEquals(x,y);
	
}

}
