import math
def factorial(ultimoValor,numeroMultiplicar):
	#Funcion recursiva explicada en clase
	if(numeroMultiplicar>0):
		# Se va llamando a ella misma mientras el valor sea superior a 0
		ultimoValor=factorial(ultimoValor,numeroMultiplicar-1)
		ultimoValor=ultimoValor*numeroMultiplicar
	else:
        print("El numero no se puede factorizar")
	return ultimoValor
try:
	numero = int(input("Intrduce un numero: "))
	# USamos la función para el cálculo
	calculo=factorial(numero)
	print ("El factorial de %s es %s" % (numero,calculo))
except:
	print ("El número no es correcto")

