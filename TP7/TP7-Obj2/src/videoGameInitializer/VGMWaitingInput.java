package videoGameInitializer;

public class VGMWaitingInput implements VGMState {

	//5 Guardo el objeto con el que quiero trabajar (La maquina)
	
	VideoGameMachine VGM;

	//Seteo la variable de cuando inicializo los estados
	public VGMWaitingInput(VideoGameMachine newVGM) {
		VGM = newVGM;
	}
	
	@Override
	public void insertCoin() {

		VGM.insertCoin();

	}

	@Override
	public void pushStartButton() {

		if (VGM.coinsInserted == 0) {
			System.out.println("Must insert coins in order to play the game!");
		}
		
		if (VGM.coinsInserted == 1) {
			System.out.println("Game starting for 1 Player!");
			VGM.setVGMState(VGM.get1CoinState());
		}
		
		if (VGM.coinsInserted == 2) {
			System.out.println("Game starting for 2 Players!");
			VGM.setVGMState(VGM.get2CoinsState());
		}
	}

}
