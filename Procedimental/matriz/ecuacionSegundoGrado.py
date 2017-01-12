#!/usr/bin/python

import math

def ecuacionSegundoGrado(a,b,c):
   x1 = (-b+math.sqrt(b**2-4*a*c))/2*a
   x2 = (-b-math.sqrt(b**2-4*a*c))/2*a
   return x1,x2
  
#caso test, suficientes casos test para cubrir todos las lineas.
a = 1
b = -7
c =10

x1, x2 = ecuacionSegundoGrado(a,b,c)
if x1 == 5 and x2 == 2:
   print("PASS")
else:
   print("Fail")