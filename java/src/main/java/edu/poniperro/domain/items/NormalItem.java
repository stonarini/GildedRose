package edu.poniperro.domain.items;

public class NormalItem extends Item implements Updateable {

	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	protected void modifyQuality(int modifier) {
		if (this.getQuality() + modifier >= 50) {
			this.setQuality(50);
		} else if (this.getQuality() + modifier <= 0) {
			this.setQuality(0);
		} else {
			this.setQuality(this.getQuality() + modifier);
		}
	}

	public void updateQuality() {
		if (this.getSellIn() > 0) {
			this.modifyQuality(-1);
		} else {
			this.modifyQuality(-2);
		}
		this.decreaseSellIn();
	}

}
