package edu.poniperro;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.domain.items.NormalItem;

public class GildedRose {
    private List<NormalItem> stock = new ArrayList<NormalItem>();

    public GildedRose() {
    }

    public GildedRose(NormalItem[] items) {
        this.stock.addAll(List.of(items));
    }

    void addItem(NormalItem item) {
        this.stock.add(item);
    }

    List<NormalItem> inventory() {
        return this.stock;
    }

    void updateQuality() {
        for (int i = 0; i < this.stock.size(); i++) {
            this.stock.get(i).updateQuality();
        }
    }

}
