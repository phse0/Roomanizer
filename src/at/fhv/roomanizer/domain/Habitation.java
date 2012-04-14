package at.fhv.roomanizer.domain;

import java.util.Date;

/**
 * Represents a habitation in the hotel. In our system a habitation only contains one room,
 * which means for bigger groups of people, living in different rooms, the system manages
 * multiple habitations.
 * 
 * Additionally to the standard information the habitation contains informationabout the room,
 * the guest who lives in the room during the habitation, the employee which did the checkin,
 * and the invoiceItems, which have to be payed at the checkout. 
 * 
 * @author Daniel Rotter <daniel.rotter@students.fhv.at>
 */
public class Habitation {
	/**
	 * The id of the habitation
	 */
	private int _id;
	/**
	 * The date on which the habitation has started
	 */
	private Date _start;
	/**
	 * The date on which the habitation will end
	 */
	private Date _end;
	/**
	 * The price, for which the habitation has been sold
	 */
	private int _price;
	/**
	 * The date on which the habitation has been created
	 */
	private Date _created;
	/**
	 * A remark, which describes the deposit of the guest
	 */
	private String _deposit;
	
	/**
	 * Sets the start of the habitation
	 * @param start The start of the habitation
	 */
	public void setStart(Date start){
		_start = start;
	}
	
	/**
	 * Returns the start of the habitation
	 * @return The start of the habitation
	 */
	public Date getStart(){
		return _start;
	}
	
	/**
	 * Sets the end of the habitation
	 * @param end The end of the habitation
	 */
	public void setEnd(Date end){
		_end = end;
	}
	
	/**
	 * Returns the end of the habitation
	 * @return The end of the habitation
	 */
	public Date getEnd(){
		return _end;
	}

	/**
	 * Returns if the habitation intersects with duration spaned by the given dates
	 * @param start The start date to check
	 * @param end The end date to check
	 * @return True if the dates intersect, otherwise false
	 */
	public boolean isBetween(Date start, Date end) {
		return (_start.compareTo(end) < 0 && _end.compareTo(end) > 0) || (_start.compareTo(start) < 0 && _end.compareTo(start) > 0);
	}
}
