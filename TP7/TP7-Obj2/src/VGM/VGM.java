package VGM;

public class VGM {
	
	private CoinMeter meter;
	
	private int coins;
	
	
	public VGM() {
		coins = 0;
	}
	
	
	public void insertCoin() {
		this.coins++;
	}
	
	public String pushStartButton() {
		return meter.getStateFor(this).pushButton();
	}

	public int getCoins() {
		return coins;
	}
}
