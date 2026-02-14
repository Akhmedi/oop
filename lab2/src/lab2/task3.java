package lab2;

public class task3 {
	public static void main(String args[]) {
		Time t = new Time(17,0,0);
		
		String result = t.Universal();
		System.out.println(result);
		
		String result2 = t.Standart();
		System.out.println(result2);
		
		
		Time t2 = new Time(23,0,0);
		t.add(t2);
		
		String result3 = t.Universal();
		System.out.println(result3);
		
		String result4 = t.Standart();
		System.out.println(result4);
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour,int minute,int second) {
		setTime(hour,minute,second);
	}
	
	public Time() {
		
	}
	
	public void setTime(int hour, int minute,int second) {
		if(hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Invalid hour: " + hour);
		}
		if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute: " + minute);
        }

        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second: " + second);
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
	}
	
	
	private String twoDigits(int number) {
        if (number < 10) {
            return "0" + number;
        } else {
            return "" + number;
        }
    }
	
	public String Universal() {
		return twoDigits(hour) + ":" + twoDigits(minute) + ":" + twoDigits(second);
	}
	
	public String Standart() {
		int displayHour;
        String period;

        if (hour == 0) {
            displayHour = 12;
            period = "AM";
        } else if (hour < 12) {
            displayHour = hour;
            period = "AM";
        } else if (hour == 12) {
            displayHour = 12;
            period = "PM";
        } else {
            displayHour = hour - 12;
            period = "PM";
        }

        return twoDigits(displayHour) + ":" + twoDigits(minute) + ":" + twoDigits(second) + " " + period;
	}
	
	public void add(Time t) {

        int totalSeconds = this.second + t.second + (this.minute + t.minute) * 60 + (this.hour + t.hour) * 3600;

        totalSeconds = totalSeconds % (24 * 3600);

        this.hour = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;

        this.minute = totalSeconds / 60;
        
        this.second = totalSeconds % 60;
    }
}