package lesson1exercises.DataTypes;

public class BestComicBookMovieOf2022 {

	public static void main(String[] args) {
			
	int BatmanRTCritic = 85;
	int BatmanRTAudience = 87;

	int DoctorStrangeRTCritic = 74;
	int DoctorStrangeRTAudience = 85;
	
	System.out.println("Rotten Tomatoes Critics Score for The Batman: " + BatmanRTCritic + "%");
	System.out.println("Rotten Tomatoes Audience Score for The Batman: " + BatmanRTAudience + "%");
	
	System.out.println("Rotten Tomatoes Critics Score for Doctor Strange in the "
			+ "Multiverse of Madness: " + DoctorStrangeRTCritic + "%");
	System.out.println("Rotten Tomates Audience Score for Doctor Strange in the "
			+ "Multiverse of Madness: " + DoctorStrangeRTAudience + "%");
	
	int BatmanBoxOffice = 770836163;
	int DoctorStrangeBoxOffice = 953966938;
	
	System.out.println("Box office figures for The Batman: $" + BatmanBoxOffice);
	System.out.println("Box office figures for Doctor Strange in the "
			+ "Multiverse of Madness: $" + DoctorStrangeBoxOffice);
	
	boolean TheBatman = true;
	boolean DoctorStrangeInTheMultiverseOfMadness = false;
	
	if (TheBatman == false) {
		System.out.println("Doctor Strange in the Multiverse of Madness is the "
				+ "best CBM of 2022");
	} else if (DoctorStrangeInTheMultiverseOfMadness == false) {
			System.out.println("The Batman is the Best CBM of 2022");			
		}
	}
}