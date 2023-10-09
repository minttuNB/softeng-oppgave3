package ax.nu.softeng;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LeapYearTest {
	@Test
	public void leapYearIsDivisibleBy4ButNot100(){
		int yearDivisibleBy4And100 = 1500;
		int yearDivisibleBy4Not100 = 1616;
		/*assertAll(()->{
			assertFalse(Main.isLeapYear(yearDivisibleBy4And100));
			assertTrue(Main.isLeapYear(yearDivisibleBy4Not100));
		});*/
		assertTrue(Main.isLeapYear(yearDivisibleBy4Not100));
	}
	@Test
	public void leapYearIsDivisibleBy400(){
		int yearDivisibleBy400 = 1600;
		assertTrue(Main.isLeapYear(yearDivisibleBy400));
	}
	@Test
	public void notLeapYearNotDivisibleBy4(){
		int yearNotDivisibleBy4 = 1615;
		assertFalse(Main.isLeapYear(yearNotDivisibleBy4));
	}
	@Test
	public void notLeapYearDivisibleBy100ButNot400(){
		int yearDivisibleBy100ButNot400 = 1400;
		assertFalse(Main.isLeapYear(yearDivisibleBy100ButNot400));
	}
}
