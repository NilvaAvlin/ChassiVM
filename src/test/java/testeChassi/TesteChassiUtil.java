package testeChassi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ChassiUtil.ChassiUtil;

public class TesteChassiUtil {
	
	private ChassiUtil util;
	
	@Before
	public void inicializar(){
		util = new ChassiUtil();
	}

	@Test
	public void testarAnoAChassi() {
		assertEquals(util.obterAno("9BP17164GA0000001", 10), 2010);
	}
	
	@Test
	public void testarAnoBChassi() {
		assertEquals(util.obterAno("9BP17164GB0000001", 10), 2011);
	}
	
	@Test
	public void testarAnoCChassi() {
		assertEquals(util.obterAno("9BP17164GC0000001", 10), 2012);
	}
	
	@Test
	public void testarAnoMinusculoChassi() {
		assertEquals(util.obterAno("9bp17164ga0000001", 10), 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarChassiInvalido() {
		assertEquals(util.obterAno("100", 10), 2010);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testarPosicaoInvalida() {
		assertEquals(util.obterAno("9BP17164GC0000001", -5), 2012);
	}

}
