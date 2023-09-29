import pytest

@pytest.mark.parametrize("num","output",[(1,11)(2,22)])
def test_add():
    a=1
    b=10
    output=a+b
