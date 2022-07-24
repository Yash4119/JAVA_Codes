import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DTFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				LocalDateTime dt = LocalDateTime.now();
				System.out.println(dt);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy||");
				String D = dt.format(formatter);
				System.out.println(D);
				
	}

}
