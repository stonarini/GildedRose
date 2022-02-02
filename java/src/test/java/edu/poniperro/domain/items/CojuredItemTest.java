package edu.poniperro.domain.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CojuredItemTest {
	@Test
	public void crearConjuredItem() {

		ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 3, 6);
		assertEquals("Conjured Mana Cake", conjured.getName());
		assertEquals(3, conjured.getSellIn(), 0);
		assertEquals(6, conjured.getQuality(), 0);
	}

	@Test
	public void toStringTest() {
		ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 3, 6);
		System.out.println("toString() ConjuredItem test:");
		System.out.println(conjured.toString());
	}

	@Test
	public void updateQualityConjuredItem() {

		ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 3, 6);
		conjured.updateQuality();
		assertEquals(2, conjured.getSellIn(), 0);
		assertEquals(4, conjured.getQuality(), 0);
	}

	@Test
	public void updateQualityConjuredItemJustExpired() {

		ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", 0, 6);
		conjured.updateQuality();
		assertEquals(-1, conjured.getSellIn(), 0);
		assertEquals(2, conjured.getQuality(), 0);
	}

	@Test
	public void updateQualityConjuredItemExpired() {

		ConjuredItem conjured = new ConjuredItem("Conjured Mana Cake", -1, 6);
		conjured.updateQuality();
		assertEquals(-2, conjured.getSellIn(), 0);
		assertEquals(2, conjured.getQuality(), 0);
	}

	@Test
	public void qualityMinZERO() {

		ConjuredItem brie = new ConjuredItem("Conjured Mana Cake", 1, 1);
		brie.updateQuality();
		assertEquals(0, brie.getSellIn(), 0);
		assertEquals(0, brie.getQuality(), 0);

		brie = new ConjuredItem("Conjured Mana Cake", -1, 0);
		brie.updateQuality();
		assertEquals(-2, brie.getSellIn(), 0);
		assertEquals(0, brie.getQuality(), 0);
	}
}
