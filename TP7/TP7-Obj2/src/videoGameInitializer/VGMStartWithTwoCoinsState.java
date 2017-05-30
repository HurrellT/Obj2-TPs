package videoGameInitializer;

public class VGMStartWithTwoCoinsState implements VGMState {

	VideoGameMachine VGM;
	
	public VGMStartWithTwoCoinsState(VideoGameMachine newVGM) {
		VGM = newVGM;
	}

	@Override
	public void insertCoin() {
		VGM.insertCoin();
		VGM.setVGMState(VGM.get2CoinsState());
	}

	@Override
	public void pushStartButton() {
		System.out.println("Game starting for 2 Players!");
		VGM.discountCoins(2);
		
		if (VGM.coinsInserted == 0) {
			VGM.setVGMState(VGM.getNoCoinsState());
		}
		if (VGM.coinsInserted == 1) {
			VGM.setVGMState(VGM.get1CoinState());
		}
		if (VGM.coinsInserted == 2) {
			VGM.setVGMState(VGM.get2CoinsState());
		}
	}

}
