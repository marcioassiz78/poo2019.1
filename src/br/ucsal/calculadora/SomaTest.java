package br.ucsal.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomaTest {

	@Test
	void testSomarDoisNumeros() {
		Soma soma = new Soma();
		double resultado = soma.somarDoisNumeros(1, 1);
		assertEquals(2.0, resultado);
	}

}
