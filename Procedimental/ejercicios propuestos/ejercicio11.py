numero_uno = int(input("Introduce el primer numero: "))
numero_dos = int(input("Introduce el segundo numero: "))
numero_tres = int(input("Introduce el tercer numero: "))
print ("Numeros introducidos:", numero_uno, numero_dos, numero_tres)
if (numero_uno + numero_dos == numero_tres):
    print("Se cumple que", numero_tres ,"es igual a ", numero_uno, "+",numero_dos)
elif (numero_uno + numero_tres == numero_dos):
        print("Se cumple que", numero_dos ,"es igual a ", numero_uno, "+", numero_tres)
elif (numero_dos + numero_tres == numero_uno):
        print("Se cumple que", numero_uno ,"es igual a:", numero_dos, "+", numero_tres)      
else:
        print("Los numeros no cumplen la condicion")

    

