import pytest
from yatzy import Yatzy

# Chance
# The player scores the sum of all dice, no matter what they read.


def test_chance():
    # iterar sobre *args evita codigo cableado a 5 argumentos
    assert 15 == Yatzy.chance(1, 2, 3, 4, 5)
    assert 14 == Yatzy.chance(1, 1, 3, 3, 6)
    assert 21 == Yatzy.chance(4, 5, 5, 6, 1)


@pytest.fixture
def inyector():
    # Es el setup de unittest o de Junit
    # Crea un objeto a la clase Yatzy
    tirada = Yatzy(1, 2, 3, 4, 5)   #programar todos los metodos del Yatzy que tengan un "SELF".
    return tirada


def test_fours(inyector):
    # Es necesario un objeto ya creado
    valorEsperado = 4
    # No puedo testear con fixtures = inyeccion de dependencias
    # los metodos estaticos como chance()
    assert 4 == inyector.fours()

def test_fours(inyector):
    # Es necesario un objeto ya creado
    valorEsperado = 5
    # No puedo testear con fixtures = inyeccion de dependencias
    # los metodos estaticos como chance()
    assert 5 == inyector.five()
crear rama, crear caso test, cambias codigo , pasas caso test, cambias codigo, pasas caso test