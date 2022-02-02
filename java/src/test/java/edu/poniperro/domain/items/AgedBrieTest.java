package edu.poniperro.domain.items;

import static org.junit.Assert.*;
import org.junit.Test;

public class AgedBrieTest {

    @Test
    public void crearAgedBrie() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSellIn(), 0);
        assertEquals(0, cheese.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        System.out.println("toString() Aged Brie test:");
        System.out.println(cheese.toString());
    }

    @Test
    public void updateQualityBrie() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        cheese.updateQuality();
        assertEquals(1, cheese.getSellIn(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualityBrieExpired() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 0, 0);
        cheese.updateQuality();
        assertEquals(-1, cheese.getSellIn(), 0);
        assertEquals(2, cheese.getQuality(), 0);
    }

    @Test
    public void qualityMax50() {
        AgedBrie brie = new AgedBrie("Aged Brie", -1, 50);
        brie.updateQuality();
        assertEquals(-2, brie.getSellIn(), 0);
        assertEquals(50, brie.getQuality(), 0);

        brie = new AgedBrie("Aged Brie", -1, 49);
        brie.updateQuality();
        assertEquals(-2, brie.getSellIn(), 0);
        assertEquals(50, brie.getQuality(), 0);
    }
}
