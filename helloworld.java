
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FirstSchDay {

	public static void main(String[] args) {
		LocalDateTime firstDayOfSch = LocalDateTime.of(2019, 4, 15, 9, 15);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy, hhmm a");
		String datetime_=firstDayOfSch.format(formatter);
		System.out.println("The first day of school is on " +
		firstDayOfSch.format(formatter));
		} }
