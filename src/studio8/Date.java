package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month, day, year;
	private boolean holiday;
	
	
	
	/**
	 * 
	 * @param Month: from 1-12
	 * @param Day: from 1-31
	 * @param Year: what year does the day fall in
	 * @param Holiday: checks if the day is a holiday or not
	 */
	public Date(int Month, int Day, int Year, boolean Holiday) {
		month = Month;
		day = Day;
		year = Year;
		holiday = Holiday;
		
	}
	
	
	
	
	
	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isHoliday() {
		return holiday;
	}


	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

    public static void main(String[] args) {
    	
    	
    	Date date = new Date(12,9,2003,true);
    	Date date1 = new Date(12,9,2003,true);
    	Date date2 = new Date(2,19,2002,true);
    	Date date3 = new Date(9,11,2001,true);
    	Date date4 = new Date(7,4,1775,true);
    	
    	
    	LinkedList<Date> listOfDates = new LinkedList<Date>();
    
    	listOfDates.add(date);
    	listOfDates.add(date1);
    	listOfDates.add(date2);
    	listOfDates.add(date3);
    	listOfDates.add(date4);
    	
    	System.out.println(listOfDates);

    	HashSet<Date> setOfDates = new HashSet<Date>();
    	setOfDates.add(date);
    	setOfDates.add(date1);
    	setOfDates.add(date2);
    	setOfDates.add(date3);
    	setOfDates.add(date4);
    	
    	System.out.println(setOfDates);
    	
    	
    	
    	

//    	if (date.equals(date1))
//    	{
//    		System.out.println("true");
//    	}
//    	else {
//    		System.out.println("false");
//
//    	}
 
   
    }
    public String toString() {
    	return getDay() + "/" + getMonth() + "/"+ getYear();
    }





	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}
    
    

}

