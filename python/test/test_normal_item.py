import pytest


@pytest.mark.create
def test_create_item():
    normal_item = NormalItem("+5 Dexterity Vest", 1, 1)
    assert "+5 Dexterity Vest" == normal_item.get_name()
    assert 1 == normal_item.get_sell_in()
    assert 1 == normal_item.get_quality()


@pytest.mark.update_quality
def test_update_quality():
    normal_item = NormalItem("+5 Dexterity Vest", 1, 1)
    normal_item.update_quality()
    assert 0 == normal_item.get_sell_in()
    assert 0 == normal_item.get_quality()


@pytest.mark.expired
def test_item_expired():
    normal_item = NormalItem("+5 Dexterity Vest", -1, 10)
    assert -2 == normal_item.get_sell_in()
    assert 8 == normal_item.get_quality()


@pytest.mark.min_quality
def test_min_quality():
    normal_item = NormalItem("+5 Dexterity Vest", 10, 0)
    assert 9 == normal_item.get_sell_in()
    assert 0 == normal_item.get_quality()
