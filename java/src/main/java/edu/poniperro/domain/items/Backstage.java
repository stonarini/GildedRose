package edu.poniperro.domain.items;

public class Backstage extends NormalItem {
	public Backstage(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (this.getSellIn() > 10) {
			this.modifyQuality(1);
		} else if (this.getSellIn() > 5) {
			this.modifyQuality(2);
		} else if (this.getSellIn() > 0) {
			this.modifyQuality(3);
		} else {
			this.setQuality(0);
		}
		this.decreaseSellIn();
	}
}
