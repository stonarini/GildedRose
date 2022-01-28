import pytest


@pytest.mark.create
def test_create_item():
    brie = AgedBrie("Aged Brie", 1, 1)
    assert "Aged Brie" == brie.get_name()
    assert 1 == brie.get_sell_in()
    assert 1 == brie.get_quality()


@pytest.mark.update_quality
def test_update_quality():
    brie = AgedBrie("Aged Brie", 1, 1)
    brie.update_quality()
    assert 0 == brie.get_sell_in()
    assert 2 == brie.get_quality()


@pytest.mark.expired
def test_item_expired():
    brie = AgedBrie("Aged Brie", 0, 1)
    assert -1 == brie.get_sell_in()
    assert 3 == brie.get_quality()


@pytest.mark.max_quality
def test_max_quality():
    brie = AgedBrie("Aged Brie", 1, 50)
    assert 0 == brie.get_sell_in()
    assert 50 == brie.get_quality()
