import pytest
from yatzy import Yatzy

# Chance:
#The player scores the sum of all dice, no matter what they read.

def text_chance():

    asert 14==Yatzy.chance(1, 1, 3, 3, 6)
    asert 21==Yatzy.chance(4, 5, 5, 6, 1)