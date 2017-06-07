package VGM;

public class VGM2CoinsState implements VGMEstados {

	@Override
	public Boolean puedeHacerseCargoDe(VGM vgm) {
		return vgm.getCoins() >= 2; 
		
	}
	
	@Override
	public String pushButton() {
		return ("2 Jugadores");
	}

}
