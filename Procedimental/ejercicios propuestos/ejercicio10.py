numero_uno = int(input("Introduce el primer numero: "))
numero_dos = int(input("Introduce el segundo numero: "))

if (numero_uno >= 0 and numero_dos >= 0):
    print (numero_uno + numero_dos)

elif (numero_uno < 0 and numero_dos < 0):
        print ("No se calcula los dos numeros son negativos")

elif (numero_uno < 0 and numero_dos >= 0):
            print ("No se calcula la suma porque el primer numero es negativo")

elif (numero_uno >= 0 and numero_dos < 0):
                print ("No se calcula la suma porque el segundo numero es negativo")