package studio8;

import java.util.Objects;

public class Time {

	private int hour, minute;
	private boolean military;
	
	public Time(int anHour, int aMinute,boolean isMilitary) {
		hour=anHour;
		minute=aMinute;
		military=isMilitary;
	}
	
	
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public boolean isMilitary() {
		return military;
	}


	public void setMilitary(boolean military) {
		this.military = military;
	}


	public static void main(String[] args) {
		
		Time Andy = new Time (0,13,false);
		System.out.print(Andy);
    	
    }

	public String toString() {
		if(isMilitary()) {
		return getHour()+ ":" + getMinute();
		}
		else if (getHour()>=12) {
			return getHour()%12 + ":"+ getMinute()+ "pm";
		}
		else if (getHour()==0) {
			return "12:" + getMinute()+"am";
		}
		else
			return getHour()+ ":" + getMinute()+"am";
	}


	@Override
	public int hashCode() {
		return Objects.hash(hour, military, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && military == other.military && minute == other.minute;
	}
	
}