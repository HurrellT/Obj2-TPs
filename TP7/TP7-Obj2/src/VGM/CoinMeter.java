package VGM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoinMeter {

	List<VGMEstados> estados = Arrays.asList(new VGMNoCoinState(),new VGM1CoinState(),new VGM2CoinsState());

	
	public VGMEstados getStateFor(VGM vgm) {
		Stream<VGMEstados> states = estados.stream();
		
		List<VGMEstados> finalState =
		states	.filter(e -> e.puedeHacerseCargoDe(vgm))
				.collect(Collectors.toList());		
		
		return finalState.get(0);
	}
	
}
