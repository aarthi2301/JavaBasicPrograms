import java.util.Arrays;

public class DSArrays {

	public static void main(String[] args) {

		int[] nums; //Declare an array
		double[] otherNums = new double[5]; // Declare and allocate an array
		String[] availPets = {"cat", "dog", "fish"}; //Declare, allocate & initializing array
		String[] unavailPets = {"bird", "rabbit", "hamster"};
		
		System.out.println(Arrays.toString(availPets));
		System.out.println(Arrays.toString(unavailPets));

		
		String availFist = availPets[2];
		String unavailBird = unavailPets[0];
		
		availPets[2]= unavailBird;
		unavailPets[0] = availFist;
		
		System.out.println(Arrays.toString(availPets));
		System.out.println(Arrays.toString(unavailPets));
		
	}

}
