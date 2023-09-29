import pytest

@pytest.mark.xfail
@pytest.mark.skip
def even(input):
    input % 2==0
    assert input == 0
