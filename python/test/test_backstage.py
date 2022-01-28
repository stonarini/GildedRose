import pytest


@pytest.mark.create
def test_create_item():
    ticket = Backstage("Backstage", 1, 1)
    assert "Backstage passes to a TAFKAL80ETC concert" == ticket.get_name()
    assert 1 == ticket.get_sell_in()
    assert 1 == ticket.get_quality()


@pytest.mark.update_quality_ten
def test_update_quality_ten():
    ticket = Backstage("Backstage passes to a TAFKAL80ETC concert", 11, 10)
    ticket.update_quality()
    assert 10 == ticket.get_sell_in()
    assert 11 == ticket.get_quality()


@pytest.mark.update_quality_five
def test_update_quality_five():
    ticket = Backstage("Backstage passes to a TAFKAL80ETC concert", 6, 10)
    ticket.update_quality()
    assert 5 == ticket.get_sell_in()
    assert 12 == ticket.get_quality()


@pytest.mark.update_quality_zero
def test_update_quality_zero():
    ticket = Backstage("Backstage passes to a TAFKAL80ETC concert", 2, 10)
    ticket.update_quality()
    assert 1 == ticket.get_sell_in()
    assert 13 == ticket.get_quality()


@pytest.mark.expired
def test_item_expired():
    ticket = Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 30)
    assert -1 == ticket.get_sell_in()
    assert 0 == ticket.get_quality()


@pytest.mark.max_quality
def test_max_quality():
    ticket = Backstage("Backstage passes to a TAFKAL80ETC concert", 2, 50)
    assert 0 == ticket.get_sell_in()
    assert 50 == ticket.get_quality()

    ticket = Backstage("Backstage passes to a TAFKAL80ETC concert", 13, 49)
    assert 0 == ticket.get_sell_in()
    assert 50 == ticket.get_quality()
