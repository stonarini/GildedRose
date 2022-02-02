package edu.poniperro.domain.items;

public class ConjuredItem extends NormalItem {
	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (this.getSellIn() > 0) {
			this.modifyQuality(-2);
		} else {
			this.modifyQuality(-4);
		}
		this.decreaseSellIn();
	}
}
