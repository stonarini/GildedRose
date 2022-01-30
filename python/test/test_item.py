import pytest
from src.item import Item


@pytest.mark.create
def test_create_item():
    item = Item("Item", 1, 1)
    assert "Item" == item.name
    assert 1 == item.sell_in
    assert 1 == item.quality
