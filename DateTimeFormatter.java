
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

		
	}

}
