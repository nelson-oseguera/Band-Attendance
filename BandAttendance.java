package BandAttendance;

public class BandAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the border/header of the band attendance list
		System.out.println("//////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		// Create the Band Attendance title and center it with tab characters
		System.out.println("|=\t  Band Attendance\t   =|");
		// Create the border/footer of the band attendance list
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////");
		// Create the sections of the list including the names, locations, and attendance. Space them out with tab characters
		System.out.println("Name\t\tD.C.\tL.A.\tTotal");
		// Create borders underneath the sections, and space them out with tab characters
		System.out.println("----\t\t---\t-----\t-----");
		// List off band names, and attendance for the locations. Finally add the numbers together for each band with the + operator. Separated with tab characters.
		System.out.println("Green Day\t36,000\t42,000\t" + (36000 + 42000));
		
		System.out.println("Polyphia\t7,000\t9,000\t" + (7000 + 9000));
		
		System.out.println("Gorillaz\t48,000\t56,000\t" + (48000 + 56000));
		
		System.out.println("Post Malone\t28,000\t37,000\t" + (28000 + 37000));
		
		System.out.println("Plini\t\t3,000\t5,000\t" + (3000 + 5000));
		// End of list
	}

}
