package at.fhv.roomanizer.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class HabitationTest {
	
	private Habitation h;
	
	@Before
	public void setUp(){
		h = new Habitation();
		h.setStart(new Date(2012, 8, 6));
		h.setEnd(new Date(2012, 8, 20));
	}
	
	@Test
	public void isBetween() {
		boolean t1 = h.isBetween(new Date(2012,10,15), new Date(2012,11,1));
		boolean t2 = h.isBetween(new Date(2012, 7,2), new Date(2012,7,16));
		boolean t3 = h.isBetween(new Date(2012, 8, 9), new Date(2012, 8, 15));
		boolean t4 = h.isBetween(new Date(2012,8,3), new Date(2012,8,9));
		boolean t5 = h.isBetween(new Date(2012, 8, 17), new Date(2012,8,23));
		
		assertTrue(!t1);
		assertTrue(!t2);
		assertTrue(t3);
		assertTrue(t4);
		assertTrue(t5);
	}
}
