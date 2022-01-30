import pytest
from src import Sulfuras


@pytest.mark.create
def test_create_item():
    sulfuras = Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80)
    assert "Sulfuras, Hand of Ragnaros" == sulfuras.get_name()
    assert 0 == sulfuras.get_sell_in()
    assert 80 == sulfuras.get_quality()


@pytest.mark.update_quality
def test_update_quality():
    sulfuras = Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80)
    sulfuras.update_quality()
    assert 0 == sulfuras.get_sell_in()
    assert 80 == sulfuras.get_quality()
