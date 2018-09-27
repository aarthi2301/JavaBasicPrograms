import java.util.Random;

public class DiceStatic {

	public static int sideOfDice = 6;
	int faceValue =0;
	
	public static void changeSide(int side) {
		DiceStatic.sideOfDice = side; //static variables can be accessed directly by class name. not instance
	}
	
	public int roll() {
		Random rand = new Random();
		this.faceValue = rand.nextInt(sideOfDice) + 1;
		return this.faceValue;
	}
	
	public static void main(String[] args) {
		DiceStatic ds = new DiceStatic();
		DiceStatic.changeSide(9); //static method
		//System.out.println("New value: "+DiceStatic.sideOfDice);
		for (int i=0; i<10; i++) {
			System.out.println("Face value: "+ds.roll()); //roll() is not a static method
		}
		
	}

}
