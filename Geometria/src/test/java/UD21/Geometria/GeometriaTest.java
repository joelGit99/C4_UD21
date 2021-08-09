package UD21.Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import UD21.Geometria.Geometria;

class GeometriaTest {
	
	@Test
	/**
	 * Test constructor por defecto
	 */
	public void testGeometria() {
		Geometria figura = new Geometria();
		int id = figura.getId();
		String nom = figura.getNom();
		int idEsperado = 9;
		String nomEsperado = "Default";
		assertEquals(idEsperado, id);
		assertEquals(nomEsperado, nom);
	}
	
	@Test
	/**
	 * Test constructor con parámetro
	 */
	public void testGeometria2() {
		Geometria figura = new Geometria(8);
		int id = figura.getId();
		String nom = figura.getNom();
		int idEsperado = 8;
		String nomEsperado = "Trapecio";
		assertEquals(idEsperado, id);
		assertEquals(nomEsperado, nom);
	}
	
	@Test
	/**
	 * Test método areacuadrado
	 */
	public void testareacuadrado() {
		Geometria cuadrado = new Geometria(2);
		int resultado = cuadrado.areacuadrado(4);
		int esperado = 16;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método areaCirculo
	 */
	public void testareaCirculo() {
		Geometria circulo = new Geometria(3);
		double resultado = circulo.areaCirculo(4);
		double esperado = 50.2656;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método arearectangulo
	 */
	public void testarearectangulo() {
		Geometria rectangulo = new Geometria(4);
		int resultado = rectangulo.arearectangulo(5,8);
		int esperado = 40;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método areatriangulo
	 */
	public void testareatriangulo() {
		Geometria triangulo = new Geometria(5);
		int resultado = triangulo.areatriangulo(5,8);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método areapentagono
	 */
	public void testareapentagono() {
		Geometria pentagono = new Geometria(6);
		int resultado = pentagono.areapentagono(5,8);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método arearombo
	 */
	public void testarearombo() {
		Geometria rombo = new Geometria(7);
		int resultado = rombo.arearombo(5,8);
		int esperado = 20;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método arearomboide
	 */
	public void testarearomboide() {
		Geometria romboide = new Geometria(8);
		int resultado = romboide.arearomboide(5,8);
		int esperado = 40;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método areatrapecio
	 */
	public void testareatrapecio() {
		Geometria trapecio = new Geometria(9);
		int resultado = trapecio.areatrapecio(8,2,6);
		int esperado = 30;
		assertEquals(esperado, resultado);
	}
	
	@Test
	/**
	 * Test método figura
	 */
	public void testfigura() {
		Geometria figura = new Geometria(5);
		Geometria figura2 = new Geometria(1);
		String resultado = figura.figura(5);
		String resultado2 = figura2.figura(1);
		String esperado = "Pentagono";
		String esperado2 = "cuadrado";
		assertEquals(esperado, resultado);
		assertEquals(esperado2, resultado2);
	}
	
	@Test
	/**
	 * Test setters
	 */
	public void testsetters() {
		Geometria figura = new Geometria();
		figura.setId(7);
		figura.setNom("cuadrado");
		figura.setArea(10);
		int id = figura.getId();
		String nom = figura.getNom();
		double area = figura.getArea();
		int idEsperado = 7;
		String nomEsperado = "cuadrado";
		double areaEsperada = 10;
		assertEquals(idEsperado, id);
		assertEquals(nomEsperado, nom);
		assertEquals(areaEsperada, area);
	}
	
	@Test
	/**
	 * Test toString
	 */
	public void testtoString() {
		Geometria figura = new Geometria();
		figura.setArea(10);
		String figuraString = figura.toString();
		String figuraEsperada = "Geometria [id=" + figura.getId() + ", nom=" + figura.getNom() + ", area=" + figura.getArea() + "]";
		assertEquals(figuraEsperada, figuraString);
	}
}
