package edu.poniperro.domain.items;

public class AgedBrie extends NormalItem {
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (this.getSellIn() > 0) {
			this.modifyQuality(1);
		} else {
			this.modifyQuality(2);
		}
		this.decreaseSellIn();
	}
}
