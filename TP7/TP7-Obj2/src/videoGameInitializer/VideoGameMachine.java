package videoGameInitializer;

public class VideoGameMachine {

	//2 defino los estados
	
//	VGMState VGMWaitingInput;
	VGMState VGMStartWithoutCoinsState;
	VGMState VGMStartWithOneCoinState;
	VGMState VGMStartWithTwoCoinsState;
	
	//3 la variable que guarda el estado actual
	VGMState vgmState;
	
	//4 Definir los colabs internos y constructor de la clase como siempre
	int coinsInserted = 0;
//	boolean buttonPressed = false;
	
	public void VGMMachine() {
		//inicializo los estados
//		VGMWaitingInput = new VGMWaitingInput(this);
		VGMStartWithoutCoinsState = new VGMStartWithoutCoinsState(this);
		VGMStartWithOneCoinState = new VGMStartWithOneCoinState(this);
		VGMStartWithTwoCoinsState = new VGMStartWithTwoCoinsState(this);
		
		//Estado inicial
		vgmState = VGMStartWithoutCoinsState;
		
		//Hago las variables que hacen que cambien los estados segun lo que pase
		if (coinsInserted == 1) {
			vgmState = VGMStartWithOneCoinState;
		}
		
		if (coinsInserted == 2) {
			vgmState = VGMStartWithTwoCoinsState;
		}
		
	}
	
	//Con esto se cambia el estado actual
	public void setVGMState(VGMState newState) {
		vgmState = newState;
	}
	
	//Cada estado va a hacer la accion de diferente manera.
	public void insertCoin() {
		coinsInserted++;
	}
	
	public void pushStartButton() {
		vgmState.pushStartButton();
	}
	
	//getters
	
//	public VGMState getWaitingState() { return VGMWaitingInput; }
	public VGMState get1CoinState() { return VGMStartWithOneCoinState; }
	public VGMState get2CoinsState() { return VGMStartWithTwoCoinsState; }
	public VGMState getNoCoinsState() { return VGMStartWithoutCoinsState; }

	public void discountCoins(int value) {
		
		coinsInserted = coinsInserted - value ;
		
	}

}
