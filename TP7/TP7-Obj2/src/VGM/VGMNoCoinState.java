package VGM;

public class VGMNoCoinState implements VGMEstados {

	@Override
	public Boolean puedeHacerseCargoDe(VGM vgm) {
		return vgm.getCoins() == 0;
	}
	
	@Override
	public String pushButton() {
		return ("Debe insertar fichas!");
	}

}
