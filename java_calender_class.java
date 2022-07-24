
import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;

public class java_calender_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone().getID());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2024));
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		System.out.println(TimeZone.getAvailableIDs()[3]);
		System.out.println(TimeZone.getAvailableIDs()[4]);
	}

}
