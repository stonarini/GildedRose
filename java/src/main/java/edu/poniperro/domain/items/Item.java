package edu.poniperro.domain.items;

public class Item {
	private final String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return this.name;
	}

	public int getSellIn() {
		return this.sellIn;
	}

	void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	void decreaseSellIn() {
		this.setSellIn(this.getSellIn() - 1);
	}

	public int getQuality() {
		return this.quality;
	}

	void setQuality(int value) {
		this.quality = value;
	}

	@Override
	public String toString() {
		return "Item Name: " + this.name + "\nSell in: " + this.sellIn + "\nQuality: " + this.quality;
	}

}
