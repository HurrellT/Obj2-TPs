package videoGameInitializer;

public class VGMStartWithOneCoinState implements VGMState {

	VideoGameMachine VGM;
	
	public VGMStartWithOneCoinState(VideoGameMachine newVGM) {
		VGM = newVGM;
	}

	@Override
	public void insertCoin() {
		VGM.insertCoin();
		VGM.setVGMState(VGM.get2CoinsState());
	}

	@Override
	public void pushStartButton() {
		System.out.println("Game starting for 1 Player!");
		VGM.discountCoins(1);
		VGM.setVGMState(VGM.getNoCoinsState());
	}

}
