package videoGameInitializer;

public class VGMStartWithoutCoinsState implements VGMState {

	VideoGameMachine VGM;

	public VGMStartWithoutCoinsState(VideoGameMachine newVGM) {
		VGM = newVGM;
	}
	
	@Override
	public void insertCoin() {
	
		VGM.insertCoin();
		VGM.setVGMState(VGM.get1CoinState());

	}

	@Override
	public void pushStartButton() {
		System.out.println("Must insert coins in order to play the game!");
		VGM.discountCoins(0);
		VGM.setVGMState(VGM.getNoCoinsState());
	}

}
