package videoGameInitializer;

public class Main {

	public static void main(String[] args) {

		VideoGameMachine VGM = new VideoGameMachine();
		
		VGM.pushStartButton();
		
		VGM.insertCoin();
		
		VGM.pushStartButton();
		
		VGM.insertCoin();
		VGM.insertCoin();
		
		VGM.pushStartButton();
	}

}
