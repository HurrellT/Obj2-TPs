package VGMTest;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import VGM.VGM;

public class VGMTest {
	
	VGM vgm;
	VGM dummyVGM;

	@Before
	public void setUp() throws Exception {
		dummyVGM = mock(VGM.class);
	}

	@Test
	public void test01UnVGMCon0FichasDiceQueInsertesFichas() {
		assertTrue("Debe insertar fichas!" == vgm.pushStartButton());
	}

}
