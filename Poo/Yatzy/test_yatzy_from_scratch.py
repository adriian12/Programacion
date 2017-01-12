#crear rama, crear caso test, cambias codigo , pasas caso test, cambias codigo, pasas caso test

import pytest
from yatzy import Yatzy

# Chance
# The player scores the sum of all dice, no matter what they read.


def test_chance():
    # iterar sobre *args evita codigo cableado a 5 argumentos
    assert 15 == Yatzy.chance(1, 2, 3, 4, 5)
    assert 14 == Yatzy.chance(1, 1, 3, 3, 6)
    assert 21 == Yatzy.chance(4, 5, 5, 6, 1)

def test_yatzy():
    assert 50 == Yatzy.yatzy(1,1,1,1,1)
    assert 0 == Yatzy.yatzy(1,1,1,2,1)
    assert 50 == Yatzy.yatzy(6,6,6,6,6)

def test_ones():
    assert 0 == Yatzy.ones(3,3,3,4,5)   #   3,3,3,4,5 placed on "ones" scores 0

def test_twos():
    assert 4 == Yatzy.twos(2,3,2,5,1)   #   2,3,2,5,1 placed on "twos" scores 4  (2+2)

#def test_threes():
#    assert 4 == Yatzy.threes(2,3,2,5,1)   #

#def test_fours():
#    assert 8 == Yatzy.fours(1,1,2,4,4) #   1,1,2,4,4 placed on "fours" scores 8 (4+4)

#def test_fives():
#    assert 4 == Yatzy.fives(2,3,2,5,1)   #

#def test_sixes():
#    assert 4 == Yatzy.sixes(2,3,2,5,1)   #
