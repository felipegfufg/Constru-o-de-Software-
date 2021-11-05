package br.com.gilmar;

import br.com.gilmar.ValoresInvalidosException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class AvaliacaoTest {
	
	private Avaliacao avaliacao;
	
	@Before
	public void setup() {
		avaliacao = new Avaliacao();
	}
	
	
	@Test (expected = ValoresInvalidosException.class)
	public void testCenario1(){
		
		avaliacao.avalia(5, 6, 0, -1);
		
	}
	
	@Test (expected = ValoresInvalidosException.class)
	public void testCenario2() {
		
		avaliacao.avalia(5, 6, 3, 2);
		
	}
	
	@Test (expected = ValoresInvalidosException.class)
	public void testCenario3() {
		
		avaliacao.avalia(11, 6, 1, 2);
		
	}
	
	@Test (expected = ValoresInvalidosException.class)
	public void testCenario4() {
		
		avaliacao.avalia(5, -1, 1, 2);
		
	}
	
	@Test 
	public void testCenario5() {
		
		avaliacao.avalia(5, 6, 3, 10);
		
	}
	
	@Test 
	public void testCenario6() {
		
		avaliacao.avalia(2, 3, 1, 10);
		
	}
	
	@Test 
	public void testCenario7() {
		
		avaliacao.avalia(4, 5, 2, 10);
		
	}
	
	@Test 
	public void testCenario8() {
		
		avaliacao.avalia(6, 7, 2, 10);
		
	}
	
	

}
