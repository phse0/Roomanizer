package at.fhv.roomanizer.test.reservation;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import at.fhv.roomanizer.test.room.Category;
import at.fhv.roomanizer.test.room.Habitation;
import at.fhv.roomanizer.test.room.Room;

public class ReservationTest {
	
	private Reservation r;
	private Category c;
	private Room r1;
	private Room r2;
	private Room r3;

	@Before
	public void setUp() throws Exception {
		r = new Reservation();
		r.setStart(new Date(2012,8,28));
		r.setEnd(new Date(2012,9,10));
		
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
	public void hasDates() {
		assertEquals("Correct start date?", new Date(2012,8,28), r.getStart());
		assertEquals("Correct end date?", new Date(2012,9,10), r.getEnd());
	}
	
	@Test
	public void hasReservationItems(){
		assertNotNull("Reservation exitsts?", r.getReservationItems());
	}
	
	@Test
	public void isAvailable1(){
		r.createItem(c,1);
		Room[] actual1 = r.checkAvailibility();
		Room[] expected1 = {r2};
		assertArrayEquals("Returns room2?", expected1, actual1);
		
	}
	
	@Test
	public void isAvailable2(){
		r.createItem(c,2);
		Room[] actual2 = r.checkAvailibility();
		Room[] expected2 = {};
		assertArrayEquals("Returns empty array?", expected2, actual2);
	}
}
