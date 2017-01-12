numero_uno = int(input("Introduce el primer numero: "))
numero_dos = int(input("Introduce el segundo numero: "))

if (numero_uno %2 == 0 and numero_dos %2 == 0 and numero_uno < 50 and numero_dos >=100 and numero_dos <=500):
    print ("Total: ", numero_uno + numero_dos)
else:
    print ("Warning!!!!")