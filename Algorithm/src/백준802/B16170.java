package 백준802;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class B16170 {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		LocalDate koreaNow = LocalDate.now(ZoneId.of("Europe/Paris"));

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd");
		String formatedNow1 = now.format(formatter1);
		String formatedNow2 = now.format(formatter2);
		String formatedNow3 = now.format(formatter3);
																					
		System.out.println(formatedNow1);
		System.out.println(formatedNow2);
		System.out.println(formatedNow3);

	}

}
