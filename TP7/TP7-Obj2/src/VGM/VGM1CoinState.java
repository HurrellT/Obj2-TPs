package VGM;

public class VGM1CoinState implements VGMEstados {

	@Override
	public Boolean puedeHacerseCargoDe(VGM vgm) {
		return vgm.getCoins() == 1;
	}
	
	@Override
	public String pushButton() {
		return ("1 Jugador"); 
	}

}
