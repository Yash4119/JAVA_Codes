 import java.util.Date;

public class Date_and_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		System.out.println(Long.MAX_VALUE);
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.getSeconds());
		System.out.println(d.getYear());
	}

}
