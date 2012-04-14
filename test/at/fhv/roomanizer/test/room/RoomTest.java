import static org.junit.Assert.*;

import java.util.Date;


import org.junit.Before;
import org.junit.Test;

import at.fhv.roomanizer.domain.Habitation;
import at.fhv.roomanizer.domain.room.Room;




public class RoomTest {

	Habitation h1;
	Room r1;
	Habitation h2;
	Room r2;
	Category c1;
	Category c2;
	Date startDate1;
	Date endDate1;
	Date startDate2;
	Date endDate2;
	Date startDate3;
	Date endDate3;
	Date startDate4;
	Date endDate4;
	
	@Before
	public void setUp(){
		r1 = new Room();
		h1 = new Habitation();
		r2 = new Room();
		h2 = new Habitation();
		
		startDate1 = new Date(2012, 5, 1);
		endDate1 = new Date(2012, 5, 7);
		startDate2 = new Date(2012,5,8);
		endDate2 = new Date(2012,5,15);
		startDate3 = new Date(2012,5,22);
		endDate3 = new Date(2012,5,29);
		startDate4 = new Date(2012,6,5);
		endDate4 = new Date(2012,6,12);

		//Naming the categorys
		c1.setName("Luxus");
		c2.setName("Holzklasse");
		
		c1.addRoom(r1);
		c2.addRoom(r2);
		
		//Adding properties to the rooms
		r1.setId(1);
		r1.setNumber("001");
		r1.setStatus("BESETZT-UNGEREINIGT"); //not final as string
		h1.setStart(startDate1);
		h1.setEnd(endDate1);
		
		
		r2.setId(2);
		r2.setNumber("002");
		r2.setStatus("FREI-UNGEREINIGT"); //not final as string
		h2.setStart(startDate3);
		h2.setEnd(endDate3);
		
		
		//Assign habitation to the rooms
		r1.addHabitation(h1);
		r2.addHabitation(h2);
		

	}
	
	@Test
	public void isAvailable() {
		assertFalse("Room should NOT be available due to h", r1.checkAvailability(startDate1, endDate1));
		assertTrue("Room should BE available", r1.checkAvailability(startDate2, endDate2));
	}
	
	@Test
	public void isNumberCorrect() {
		assertEquals("Room number correct?", "001", r1.getNumber());
		assertEquals("Room number correct?", "002", r2.getNumber());
	}
	
	@Test
	public void isIdCorrect(){
		assertEquals("Room id correct?", 1, r1.getId());
		assertEquals("Room id correct?", 2, r2.getId());
	}
	
	/* TODO Does the room know his cateogry?
	@Test
	public void isCategory(){
		assertEquals("Right category?", "Luxus", r1.getCategory());
		assertEquals("Right category?", "Holzklasse", r2.getCategory());
	}*/

	/* TODO Status of the room will not be String...
	@Test
	public void checkStatus(){
		assertEquals("Right status?", "BESETZT-UNGEREINIGT", r1.getStatus());
		assertEquals("Right status?", "FREI-GEREINIGT", r2.getStatus());
	}*/
}
