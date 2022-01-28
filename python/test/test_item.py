import pytest


@pytest.mark.create
def test_create_item():
    item = Item("Item", 1, 1)
    assert "Item" == item.get_name()
    assert 1 == item.get_sell_in()
    assert 1 == item.get_quality()
