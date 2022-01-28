import pytest


@pytest.mark.create
def test_create_item():
    conjured = ConjuredItem("Conjured Mana Cake", 1, 1)
    assert "Conjured Mana Cake" == conjured.get_name()
    assert 1 == conjured.get_sell_in()
    assert 1 == conjured.get_quality()


@pytest.mark.update_quality
def test_update_quality():
    conjured = ConjuredItem("Conjured Mana Cake", 3, 6)
    conjured.update_quality()
    assert 2 == conjured.get_sell_in()
    assert 4 == conjured.get_quality()


@pytest.mark.expired
def test_item_expired():
    conjured = ConjuredItem("Conjured Mana Cake", -1, 6)
    assert -2 == conjured.get_sell_in()
    assert 2 == conjured.get_quality()

    conjured = ConjuredItem("Conjured Mana Cake", 0, 6)
    assert -1 == conjured.get_sell_in()
    assert 2 == conjured.get_quality()


@pytest.mark.min_quality
def test_min_quality():
    conjured = ConjuredItem("Conjured Mana Cake", 0, 0)
    assert -1 == conjured.get_sell_in()
    assert 0 == conjured.get_quality()

    conjured = ConjuredItem("Conjured Mana Cake", 1, 1)
    assert 0 == conjured.get_sell_in()
    assert 0 == conjured.get_quality()
