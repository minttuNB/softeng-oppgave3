package ax.nu.softeng;

public class Main {
	public static boolean isLeapYear(int year){
		if(year % 4 == 0){
			if(year % 100 == 0){
				return year % 400 == 0;
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}