package encriptadorTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import encriptador.EncriptadorBasico;
import encriptador.EncriptadorCopado;
import encriptador.EncriptadorNaive;

public class EncriptadorNaiveTest {

	EncriptadorNaive encriptadorBasicoDePrueba = new EncriptadorBasico();
	EncriptadorNaive encCopadoDePrueba = new EncriptadorCopado();
	
	String textSinEnc = "Frase de prueba.";
	
	String textConEncBas = ".abeurp ed esarF";
	
	String textConEncCop = "P|k}o*no*z|olk8";
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testEncriptadoBasico() {
		assertEquals(textConEncBas, encriptadorBasicoDePrueba.encriptar(textSinEnc));
		assertEquals(textSinEnc, encriptadorBasicoDePrueba.desencriptar(encriptadorBasicoDePrueba.encriptar(textSinEnc)));
	}
	
	@Test
	public void testDesncriptadoBasico() {
//		System.out.println(encCopadoDePrueba.encriptar(textSinEnc));
		assertEquals(textConEncCop, encCopadoDePrueba.encriptar(textSinEnc));
		assertEquals(textSinEnc, encCopadoDePrueba.desencriptar(encCopadoDePrueba.encriptar(textSinEnc)));
	}

}
