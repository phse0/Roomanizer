package at.fhv.roomanizer.test.room;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	
	private Category c;
	private Room r1;
	private Room r2;
	private Room r3;

	@Before
	public void setUp() throws Exception {
		Habitation h;
		c = new Category();
		c.setName("Testkategorie");
		
		//Add a few rooms with habitations to the category 
		r1 = new Room();
		r1.setNumber(1);
		h = new Habitation();
		h.setStart(new Date(2012, 8, 6));
		h.setEnd(new Date(2012, 8, 20));
		r1.addHabitation(h);
		h = new Habitation();
		h.setStart(new Date(2012, 8, 28));
		h.setEnd(new Date(2012, 9, 10));
		r1.addHabitation(h);
		c.addRoom(r1);
		
		r2 = new Room();
		r2.setNumber(2);
		h = new Habitation();
		h.setStart(new Date(2012, 8, 16));
		h.setEnd(new Date(2012, 8, 24));
		r2.addHabitation(h);
		c.addRoom(r2);
		
		r3 = new Room();
		r3.setNumber(3);
		h = new Habitation();
		h.setStart(new Date(2012, 8, 6));
		h.setEnd(new Date(2012, 8, 8));
		r3.addHabitation(h);
		h = new Habitation();
		h.setStart(new Date(2012, 8, 22));
		h.setEnd(new Date(2012, 9, 3));
		r3.addHabitation(h);
		c.addRoom(r3);
	}

	@Test
	public void hasName() {
		assertEquals("Name set?", "Testkategorie", c.getName());
	}
	
	@Test
	public void isAvailable(){
		Room[] actual1 = c.checkAvailibility(new Date(2012,8,28), new Date(2012,9,10), 1);
		Room[] expected1 = {r2};
		assertArrayEquals("Returns room2?", expected1, actual1);
		Room[] actual2 = c.checkAvailibility(new Date(2012,8,28), new Date(2012,9,10), 1);
		Room[] expected2 = {};
		assertArrayEquals("Returns empty array?", expected2, actual2);
	}
}
