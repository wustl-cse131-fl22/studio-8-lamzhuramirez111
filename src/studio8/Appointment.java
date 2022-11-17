package studio8;

public class Appointment {
private String date;
private String time;



public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}
public static String toString() {
	return "";
}

	public Appointment(String date, String time) {
		date = 
    	
	}
	
	
	public Appointment(Date date1, Time time1) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date(12,9,2003,true);
    	Date date2 = new Date(2,19,2002,true);
    	Date date3 = new Date(9,11,2001,true);
    	Date date4 = new Date(7,4,1775,true);
    	
    	Time time1 = new Time (12,23,true);
    	Time time2 = new Time (11,9,true);

    	
    	Appointment appointment1 = new Appointment(date1,time1);
    	System.out.println(appointment1);
    		
    	Appointment appointment = new Appointment("12/9/2003","12:23");
    	
    	 public String toString() {
    	    	return getDate + "/" + getMonth() + "/"+ get();
    	    }
	}

}
